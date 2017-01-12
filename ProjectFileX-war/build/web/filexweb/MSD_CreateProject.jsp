<%@page import="java.util.ArrayList"%>
<%@ include file="Up.jsp" %>
<%@ include file="MSD_Sidebar.jsp" %>
                    
            <% 
            ArrayList<Employee> emp=Employee.getEmployee();
            Employee em;
            %>

            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:50px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
			<div class="login-form" style ="">
		<h4>Create New Project</h4>

                        <form name="CreateProject" method="get" action="../ProjectControl" enctype="multipart/form-data">
                            <br/>
                            <!--<label>Project ID :</label><input type="text" name="pid" placeholder="Enter Project ID" required> <br/><br/>-->
						      <label>Project Name :</label><input type="text" name="pname" placeholder="Enter Project Name" required> <br/><br/><br/>
                              <label>Project Manager :</label>
                              <select name="pm" width="200" height="80">
                                  <option value="">Select Project Manager</option>
                                  <%
                                  for(int x=0;x<emp.size();x++){
                                  em=emp.get(x);
                                  if(em.getPosition().equals("PM/MSD")){
                                  if(!em.getEmployeeid().equals((String)session.getAttribute("eid"))){
                                  %>
                                  <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                                  <%  }
                                    }
                                  }
                                  %>
                                  
                             </select>
                            <div style="padding:0.8em 7em;"><button type="button" class="btn btn-info btn-block" style="font-size:12pt;" onclick="window.location.href='#'" alt="View currently assigned projects">Assigned projects</button></div>  
                             <br/>
                            <label>Business Analyist :</label>
                              <select name="ba" width="200" height="80">
                                  <option value="Select">Select Business Analyist</option>
                                  
                                  <%
                                  for(int x=0;x<emp.size();x++){
                                  em=emp.get(x);
                                  if(em.getPosition().equals("Business Analyist")){
                                  %>
                                  <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                                  <%
                                    }
                                  }
                                  %>
                                   
                             </select>
                            <div style="padding:0.8em 7em;"><button type="button" class="btn btn-info btn-block" style="font-size:12pt;" onclick="window.location.href='#'" alt="View currently assigned projects">Assigned projects</button></div>  
                            <br/><br/>

						<div class="clearfix"></div>
						<input  class="btn btn-warning btn-block" type="submit" value="Create Project">
					</form>
				</div>                    
                        
                </section></section>>

<%@ include file="Down.jsp" %>