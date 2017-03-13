<%@page import="org.sampath.filex.web.actions.Department"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<section id="main-content" class="sidebar_shift">
    <section class="wrapper" style="margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;">
        <div class="login-form" style="">
            <h4>Add User</h4>
            <h5><strong></strong></h5>
            
            
            <form name="adduser" method="get" action="../AddEmp" enctype="multipart/form-data">
             <span style="float:top;"> </span>  
                <center><img src="images/user_add.png" name="icon" id="output" width="130" height="130"></center>
                <label>User ID :</label>
                <input type="text" id="id" name="id" value="" placeholder="Enter user id here" required=""><br/>
                <br/>
                <label>Name :</label>
                <input type="text" id="name" name="name" value="" placeholder="Enter user name here" required="">
                <br/><br/>
                
                <!-- Retrieving department names from the database-->
                 <%
                            ArrayList<Department> dept = Department.getDepartmentType();
                            int num = dept.size();
                            if(num==0)
                                {
                                    out.print("No Departments available.!");
                                }
                            else{
                         %>  
                
                <label>Department ID :</label>
                
               <select name="<%="depName" %>"> 
                        <option value = "" selected ="true" disabled = "disabled"> Select the Department </option>
                            
                            <%
                               for(int j=0;j<num;j++){
                             %>
                            
                        <option value =<%=dept.get(j). getDepartmentID() %> ><%=dept.get(j).getDepartmentName() %> </option>
                            <%
                                }
                            %>
                        </select>
                         
                         <%
                               }
                         %>
                
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
                
                                  
                <!--To add a new Department to the database -->
            
                
                            <form name="addnewdept" action="../AddNewDepartment" method="post">
                                <span style="float:bottom;"> </span>
                                <div class="clearfix"></div>
                                    <button style="background-color:#27AE60;  border:none;" class="btn btn-info btn-block " id="add" type = "button" onclick="showDiv()">Add a New Department</button>
                                                
           
                                    <!-- Display only if user wants to add a new department type -->
                                        <div id="div_ctrl" style="display:none">
                                            </br>
                                            <div id="addnew">
                                                <label>Department ID:</label> 
                                                <input type="text" name="depid" placeholder="New ID" />
                                                </br>
                                                <label>Department Name:</label>
                                                <input type = "text" name="depname" placeholder="Name of the new department">
                                                </br>
                                            </div> 
                                            <br /> 
                                            
                                            <input  type="submit" value="ADD" onclick=" return isEmpty()"> <br /><br/>
                                        </div>
                                                
                                        <div id="success" style="display: none">
                                            <div>Document Type Saved successfully ! </div>
                                        </div>
                                        </form> 
                                        
                                </div>
       
        <!--To show the add department form -->                 
        <script>
            function showDiv(){  //  display the input field to add new document
            document.getElementById('div_ctrl').style.display = 'block' ;  
            }
       
        
        <!--To show the success message -->
        
           function showDiv2(){
           document.getElementById('success').style.display = 'block';
           }
        
        
        
            function isEmpty(){  // input field validation
            var emptydepid = document.forms["addnewdept"]["depid"].value;
            var emptydepname = document.forms["addnewdept"]["depname"].value;
            
            if (emptydepid === ""){
            alert("Please Enter a Department ID !");
            return false;
                                                        
            }else if(emptydepname === ""){
                alert("Please Enter the Department Name !");
                return false;
            }
            
            else{
                showDiv2();
                }
            }   
            
        
        
            var loadFile = function (event) {
                var output = document.getElementById('output');
                output.src = URL.createObjectURL(event.target.files[0]);
            };
        </script>
       
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>