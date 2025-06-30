function showcourses(){
    fetch("http://localhost:8080/courses")
    .then((response) => response.json())
    .then((data)=>{
        const dtable = document.getElementById("coursetable")

        data.forEach(course => {
            var row = ` <tr>
                <td>${course.courseid}</td>
                <td>${course.coursename}</td>
                <td>${course.trainer}</td>
                <td>${course.durationinweek}</td>
            </tr>
            `;
             dtable.innerHTML += row;
        });
    });
}

function showenrolledstudents(){
    fetch("http://localhost:8080/courses/enrolledstudent")
    .then((response)=>response.json())
    .then((edata)=>{
        const etable = document.getElementById("enrolltable")
        edata.forEach(course => {
            var row = ` <tr>
                <td>${course.name}</td>
                <td>${course.email}</td>
                <td>${course.coursename}</td>
               
            </tr>
            `;
             etable.innerHTML += row;
        });
    });
  
}