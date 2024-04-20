Project Title: EmployeeData

Abstract:
EmployeeData is a project designed to manage employee data efficiently, offering CRUD (Create, Read, Update, Delete) operations within a database environment.

Service Path: http://localhost:8080/employees

Execution Workflow:
- Upon accessing the application, users are directed to the employees page, where existing employee details from the database are displayed.
- Users can use the "Add Employee" button to input new employee information into the database.
- Upon clicking the button, a form is presented, requiring users to input necessary employee details.
- After submission, the new employee is added to the list, reflecting the updated database records.
- To update existing employee information, users can select the "Update" option corresponding to the desired employee.
- When adding a new employee, their details are added to the database. on the other hand, when updating an existing employee, their information is modified in the database.
- Application provides an option to delete employees, removing them from the database.

Running the Project Locally:

- Clone the project repository to your local machine.
- Import the project into Spring Tool Suite (STS) or any other preferred IDE.
- By default, the project uses the H2 database. However, it can be modified to use other databases as per specific requirements. Ensure to verify the mapping of the employee model class to the corresponding database table.
- Run the project within your IDE environment.
- Once the project is successfully running, navigate to the specified service path to access the application.

Upcoming Features:
- Implementation of user login functionality to enhance security and access control.
- Integration of role-based authorization mechanisms, allowing different levels of access to employee details based on user roles.
= Expansion of operations available for employee management, such as the ability to send emails to employees directly from the application.