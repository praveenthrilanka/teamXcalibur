<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Admin_Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<section id="main-content" class="sidebar_shift">
    <section class="wrapper" style="margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;">
        <div class="login-form" style="">
            <h4>Add User</h4>
            <h5><strong></strong></h5>

            <form name="adduser" method="get" action="../AddEmp" enctype="multipart/form-data">

                <center><img src="images/user_add.png" name="icon" id="output" width="130" height="130"></center>
                <label>User ID :</label>
                <input type="text" id="id" name="id" value="" placeholder="Enter user id here" required=""><br/>
                <br/>
                <label>Name :</label>
                <input type="text" id="name" name="name" value="" placeholder="Enter user name here" required="">
                <br/><br/>
                <label>Department ID :</label>
                <select id="dept" name="dept" width="200" height="80">
                    <option value="">Select Department</option>
                    <option value="it">IT</option>
                    <option value="mkt">Marketing</option>
                    <option value="sa">System Audit</option>
                </select>
                <br/><br/><div>
                    <table align="center" width="70%">
                        <tbody><tr>
                                <td><label><input type="checkbox" value="y" name="msd">Manager SD</label></td>
                                <td><label><input type="checkbox" value="y" name="pm">Project Manager</label><br></td>
                            </tr>
                            <tr>
                                <td><label><input type="checkbox" value="y" name="ba">Business Analyst</label></td>
                                <td><label><input type="checkbox" value="y" name="stk">Stakeholder</label></td>
                            </tr>
                        </tbody></table>
                </div><br/>
                <label>Email :</label>
                <input type="text" id="email" name="email" value="" placeholder="Enter email here" required><br>
                <br>
                <div class="clearfix"></div>
                <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Add User"><br>
                <input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset">
            </form>
        </div>
        <script>
            var loadFile = function (event) {
                var output = document.getElementById('output');
                output.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>