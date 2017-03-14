<%@page import="org.sampath.filex.web.actions.Department"%>
<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<!-- START CONTENT -->

<%
            if (!Employee.getEmployee((String)session.getAttribute("eid")).getPosition().equals("Administrator"))
            {
                response.sendRedirect("Login.jsp");
            }
%>

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<section id="main-content" class="sidebar_shift">
    <section class="wrapper" style="margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;">
        <div class="login-form" style="">
            <h4>Edit User</h4>
            <h5><strong></strong></h5>

            <form name="adduser" method="post" action="../EditUser" >
                <center><img src="../GetIconByID?id=<%out.print(request.getParameter("id"));%>" id="output" width="130" height="130"></center>
                <input type="hidden" id="id" name="id" value="<%out.print(request.getParameter("id"));%>"><br>
                <label>User Id :</label>
                <input type="text" value="<%out.print(request.getParameter("id"));%>" disabled><br/>
                <br/>
                <label>Name :</label>
                <input type="text" id="name" name="name" value="" placeholder="Enter user name here" required=""><br>
               <br/>
                
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
                
                <select name="<%="depName" %>" required=""> 
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
                </div>
                <label>Email :</label>
                <input type="text" id="email" name="email" value="<%out.print(request.getParameter("email"));%>"<br/><br/>
                <br/>
                <div class="clearfix"></div>
                <input style="background-color:#FF9D26; border:none;" class="btn btn-info btn-block" type="submit" value="Save Changes"><br>
                <input style="background-color:FFC682; border:none;" class="btn btn-info btn-block" type="reset" id="reset">
            </form>
        </div>
       
    </section></section>

<!-- END CONTENT -->



<%@ include file="Down.jsp" %>