let user = {};
let reimbursement = {};
let output = "";

$(document).ready(() => {
    populateUser();
});

function populateUser() {
    fetch("http://localhost:7001/Project1-BankMax/session").then(function(response) {
        return response.json();
    }).then(function(data) {
        if (data.session === null) {
            window.location = "http://localhost:7001/Project1-BankMax/BankMax-Login";
        } else {
            user = data;
            console.log(user);
            output += `
                <p> Your First Name: ${user.firstName} </p>
                <br>
                <p> Your Last Name: ${user.lastName} </p>
                <br>
                <p> Your position: ${user.position} </p>
                <br>
				<p> Management: ${user.management} </p>
			`;
        }
    });
}

function populateReimbursements() {
    fetch("http://localhost:7001/Project1-BankMax/reimbursement")
    .then(function(response) => {
        return response.json();
    }).then((function(data) => {
        reimbursement = data
        console.log(reimbursement);
        $.each(reimbursement, (index, r) => {
            console.log(r);
            stuff += `
                    <tr>
                        <td>${r.id}</td>
                        <td>${r.amount}</td>
                        <td>${r.description}</td>
                        <td>${r.employeeId.id}</td>
                        <td>${r.statusId.name}</td>
                        <td>${r.resolverId}</td>
                    </tr>
                `;
        });
        <table>
            <tr>
                <td>$()</td>
            </tr>
        </table>

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
