<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="SideBar_Project.jsp" %>
           
<!-- START CONTENT -->

            <%
                String pos=Employee.getEmployee((String)session.getAttribute("eid")).getPosition();
            if (!(pos.equals("Project Manager") || pos.equals("PM/MSD")))
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
                                            <img src="images/view.png" class="img-responsive" alt="" style="padding:0em 6em">
                                        </p>
                                        <div class="caption">
                                            <div class="blur"></div>
                                            <div class="caption-text">
                                                <h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">View Documents</h3>
                                                <br/><br/>
                                                <button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="isSrsNull();"><b>View SRS</b></button></br>
                                                <button type="button" class="btn btn-warning" style="margin-top:8; width:140;" onclick="window.location.href='ViewOtherDocument.jsp'">Other Documents</button></br>
                                            </div>
                                        </div>
                                    </div>
								
					    </div>

				       <div class="col-lg-3">
				    				<div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
										<p style="text-align:center; margin-top:20px;">
											<img src="images/addstk.png" class="img-responsive" alt="" style="padding:0em 6em">
										</p>
										<div class="caption">
											<div class="blur"></div>
											<div class="caption-text">
												<h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Add Stakeholders</h3>
                                                <br/><br/>
												<button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="window.location.href='AddStakeHolders.jsp'"><b>Add</b></button>	
											</div>
										</div>
									</div>
								
					    </div>
				       <div class="col-lg-3">
                                        <div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
                                            <p style="text-align:center; margin-top:20px;">
                                                <img src="logos/history.png" class="img-responsive" alt="" style="padding:0em 6em">
                                            </p>
                                            <div class="caption">
                                                <div class="blur"></div>
                                                <div class="caption-text">
                                                    <h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Version History</h3><br/>
                                                    <button type="button" class="btn btn-warning" style="margin-top:10; width:140;" onclick="window.location.href='Version_history.jsp'">View History</button><br/><br/>

                                                </div>
                                            </div>
                                        </div>
								
					    </div>
					</div>
			</div>
               </footer>

                </section>
            </section>
            <!-- END CONTENT -->
            
            
           <script type="text/javascript">
                
                function isSrsNull(){
                    <% 
                         Project p=Project.getProject(pno);
                         if(p.getSrsid()==null){
                     %>
                             
                        $('#SRSModel').modal('show');
                        
                     <%
                         }
                         else
                         {
                     %>
                         window.location.href='Wall.jsp'
                     <%}%>    
                             
                }
                
            </script>
            
                        <!--Model starts-->
                <div class="modal fade" id="SRSModel" tabindex="-1" role="dialog" aria-labelledby="ultraModal-Label" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog animated fadeInUp"><br/><br/><br/><br/><br/><br/><br/><br/><br/>
                        <div class="modal-content">
                            <div class="modal-header">
                                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                                <h4 class="modal-title">SRS is not uploaded</h4>
                            </div>   
                            <div class="modal-body">
                                Please view the document after SRS is uploaded.
                            </div>
                            <div class="modal-footer">
                    
                               <a class="btn btn-success" type="button" data-dismiss="modal" >Got It</a>
                            </div>
                        </div>
                    </div>
                </div>
                            <!--model End-->
            

<%@ include file="Down.jsp" %>