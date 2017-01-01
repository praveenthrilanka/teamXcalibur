<%@page import="org.sampath.filex.web.actions.Project"%>
<%@ include file="Up.jsp" %>
<%@ include file="PM_SideBar_Project.jsp" %>
           
<!-- START CONTENT -->
            
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
                                                <h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Open Project</h3>
                                                <br/><br/>
                                                <button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="window.location.href='Wall.jsp'"><b>View Projects</b></button> 
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
												<button type="button" class="btn btn-warning" style="margin-top:3; width:140;" onclick="window.location.href='UploadSRS.jsp'"><b>Add</b></button>	
											</div>
										</div>
									</div>
								
					    </div>
				       <div class="col-lg-3">
                                    <div class="cuadro_intro_hover " style="background-color:#CECEE9; width:300;">
                                        <p style="text-align:center; margin-top:20px;">
                                            <img src="images/others.png" class="img-responsive" alt="" style="padding:0em 6em">
                                        </p>
                                        <div class="caption">
                                            <div class="blur"></div>
                                            <div class="caption-text">
                                                <h3 style="border-top:2px solid white; border-bottom:2px solid white; padding:10px;">Other</h3><br/>
                                                <button type="button" class="btn btn-warning" style="margin-top:10; width:140;" onclick="window.location.href='#'">Notes</button><br/><br/>
                                                <button type="button" class="btn btn-warning" style="margin-top:15; width:140;" onclick="window.location.href='#'">Reminders</button>
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
            
            

<%@ include file="Down.jsp" %>