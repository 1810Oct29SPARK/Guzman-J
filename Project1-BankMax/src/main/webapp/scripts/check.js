window.onload = function() {
    populateUser();
}

function populateUser() {
    fetch("http://localhost:7001/Project1-BankMax/session").then(function(response) {
        return response.json();
    }).then(function(data) {
        if (data.session === null) {
            window.location = "http://localhost:7001/Project1-BankMax/BankMax-Login";
        } else {
            console.log(data);
            user = data;
            document.getElementById("id").innerText = "Employee ID: "+ user.id;
            document.getElementById("firstName").innerText = "First Name: "+ user.firstName;
            document.getElementById("lastName").innerText = "Last Name: "+ user.lastName;
            document.getElementById("username").innerText = "Userame: "+ user.username;
            document.getElementById("position").innerText = "Position: "+ user.position;
            document.getElementById("management").innerText = "Management: "+ user.management;
            document.getElementById("password").innerText = "Password: "+ user.password;
        }
    });
}

function populateReimbursements() {
    fetch("http://localhost:7001/Project1-BankMax/reimbursement").then(function(response) {
        return response.json();
    }).then(function(data) {
        //.getElementById(data);
       

    });
}

$(document).ready(function() {
    $.getJSON("response.json", function(data) {
        var reimbursement_data = '';
        $.each(data, function(key, value){
            reimbursement_data += '<tr>';
            reimbursement_data += '<td>'+value.id+'</td>';
            reimbursement_data += '<td>'+value.balance+'</td>';
            reimbursement_data += '<td>'+value.status+'</td';
            reimbursement_data += '<td>'+value.empId+'</td>';
            reimbursement_data += '<td>'+value.description+'</td>';
            reimbursement_data += '</tr>';
        });
        $('#reimbursement_table').append(reimbursement_data);
    })
}) 
