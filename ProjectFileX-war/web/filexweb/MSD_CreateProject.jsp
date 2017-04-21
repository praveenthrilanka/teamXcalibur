<%@page import="java.util.ArrayList"%>
<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>

<%
    String pos = Employee.getEmployee((String) session.getAttribute("eid")).getPosition();
    if (!(pos.equals("ManagerSD") || pos.equals("PM/MSD"))) {
        response.sendRedirect("Login.jsp");
    }
%>


<%
    ArrayList<Employee> emp = Employee.getEmployee();
    Employee em;
%>

<link href="css/stylesba.css" rel='stylesheet' type='text/css' />
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

<!-- START CONTENT -->
<section id="main-content" class=" ">
    <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
        <div class="login-form" style ="">
            <h4>Create New Project</h4>

            <form name="CreateProject" method="get" action="../ProjectControl" onsubmit="isFill()" enctype="multipart/form-data">
                <br/>
                <!--<label>Project ID :</label><input type="text" name="pid" placeholder="Enter Project ID" required> <br/><br/>-->
                <label>Project Name :</label><input type="text" name="pname" id="projectName" placeholder="Enter Project Name" required > <br/><br/><br/>
                <label>Project Manager :</label>
                <select name="pm" width="200" height="80" >
                    <option selected disabled value="" >Select Project Manager</option>
                    <%
                        for (int x = 0; x < emp.size(); x++) {
                            em = emp.get(x);
                            if (em.getPosition().equals("PM/MSD") || em.getPosition().equals("Project Manager")) {
                                if (!em.getEmployeeid().equals((String) session.getAttribute("eid"))) {
                    %>
                    <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                    <%  }
                            }
                        }
                    %>

                </select>
                <div style="padding:0.8em 7em;"><input type="submit" name="pmassigned" class="btn btn-info btn-block" style="font-size:12pt;" value="Assigned projects"  alt="View currently assigned projects"></div>  
                <br/>
                <label>Business Analyst :</label>
                <select  name="ba" width="200" height="80">
                    <option selected disabled value="">Select Business Analyst</option>

                    <%
                        for (int x = 0; x < emp.size(); x++) {
                            em = emp.get(x);
                            if (em.getPosition().equals("Business Analyist")) {
                                if (!em.getEmployeeid().equals((String) session.getAttribute("eid"))) {
                    %>
                    <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                    <%  }
                            }
                        }
                    %>

                </select>
                <div style="padding:0.8em 7em;"><input type="submit" name="baassigned" class="btn btn-info btn-block" style="font-size:12pt;" value="Assigned projects"  alt="View currently assigned projects"></div>  
                <br/><br/>

                <div class="clearfix"></div>
                <input  id="submitForm" class="btn btn-warning btn-block" type="submit" value="Create Project">
                <input  class="btn btn-warning btn-block" type="reset" value="Reset">
            </form>
        </div>                    
        <!--modal start-->
        <div class="modal fade" id="ultraModal-27" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;" data-backdrop="static" data-keyboard="false">
            <div class="modal-dialog animated zoomIn"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                <div class="modal-content">
                    <div class="modal-header">
                        <center><img src="images/loading.gif" width="80px"></center>              
                    </div>
                </div>
            </div>
            <!--modal end-->
    </section></section>>

<script src="js/jquery-1.11.2.min.js"></script>

<script>

                function isFill() {
                  
                        $(document).ready(function () {

                            $("#ultraModal-27").modal();

                        });
                    
                }
</script>


<%@ include file="Down.jsp" %>