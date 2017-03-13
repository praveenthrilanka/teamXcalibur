<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar.jsp" %>
           
<!-- START CONTENT -->

            <%
                String pos=Employee.getEmployee((String)session.getAttribute("eid")).getPosition();
            if (!(pos.equals("ManagerSD") || pos.equals("PM/MSD")))
            {
                response.sendRedirect("Login.jsp");
            }
            %>

            
            <link href="css/stylesba.css" rel='stylesheet' type='text/css' />
            <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />

            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:18%; margin-left: 5%; display:inline-block;width:100%;padding:25px 0 0 15px;'>
                   
               <footer>   
		<div class="row">

                <div class="container">
						<div class="col-lg-3">
				    				<div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
										<p style="text-align:center; margin-top:20px;">
											<img src="images/upload.png" class="img-responsive" alt="" style="padding:0em 6em">
										</p>
										<div class="caption">
											<div class="blur"></div>
											<div class="caption-text">
												<h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">New Project</h3>
                                                <br/><br/>
												<button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="window.location.href='MSD_CreateProject.jsp'"><b>Create New Project</b></button>																							

											</div>
										</div>
									</div>
								
					    </div>

				       <div class="col-lg-3">
				    				<div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
										<p style="text-align:center; margin-top:20px;">
											<img src="images/view.png" class="img-responsive" alt="" style="padding:0em 6em">
										</p>
										<div class="caption">
											<div class="blur"></div>
											<div class="caption-text">
												<h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Open Project</h3>
                                                <br/><br/>
												<button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="window.location.href='MSD_Projects.jsp'"><b>View Projects</b></button>	
											</div>
										</div>
									</div>
								
					    </div>
				       <div class="col-lg-3">
				    				<div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
										<p style="text-align:center; margin-top:20px;">
											<img src="images/view_user.png" class="img-responsive" alt="" style="padding:0em 6em">
										</p>
										<div class="caption">
											<div class="blur"></div>
											<div class="caption-text">
												<h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Quick Lookup</h3>
												
                                                <form name="QuickLookup1" method="post" action="">
                                                    <select width="200" height="80">
                                                      <option value="Select">Select Project Manager</option>
                                                      <%  ArrayList<Employee> employees=Employee.getEmployee();
                                                          for(int x=0;x<employees.size();x++) 
                                                          {
                                                            Employee em;
                                                            em=employees.get(x);
                                                            
                                                          
                                                      %>
                                                      <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                                                           <%
                                                           }
                                                           %> 
                                                        
                                                    </select>
                                                    <br/>
                                                    <button type="button" class="btn btn-warning" style="margin-top:10; width:140;" onclick="window.location.href='#'">View currently assigned projects</button>   
                                                </form>

                                              <form name="QuickLookup2" method="post" action="">
                                                    <select width="200" height="80">
                                                      <option value="Select">Select Business Analyist</option>
                                                       <%  
                                                          for(int x=0;x<employees.size();x++) 
                                                          {
                                                            Employee em;
                                                            em=employees.get(x);
                                                           
                                                      %>
                                                      <option value="<% out.print(em.getEmployeeid()); %>"><% out.print(em.getEmployeename()); %></option>
                                                           <%
                                                           }
                                                           %>
                                                    </select>
                                                    <br/>
                                                    <button type="button" class="btn btn-warning" style="margin-top:10; width:140;" onclick="window.location.href='#'">View currently assigned projects</button>   
                                                </form>
											</div>
										</div>
									</div>
								
					    </div>
					</div>
			</div>
                      <br/>
                   </footer>

                </section>
            </section>
            <!-- END CONTENT -->
            
            

<%@ include file="Down.jsp" %>