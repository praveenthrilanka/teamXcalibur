<%@ include file="Up.jsp" %>
<%@ include file="SideBar_Project.jsp" %>
            
            <%
            
                if(session.getAttribute("pno")==null){
                    //response.sendRedirect("message.jsp?message=Sorry, Selected project is not available.");
                }        
            
            %>
            
            
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:35px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
                   
					<div id="pageset">
                    <div class="main-page">
                            <div class="container-fluid">
                            <br/><br/>
                             <div class="row">
                                 <div class="col-lg-7" >
                                     <iframe name='fra2' src='../GetFile' width="610" height="550" ></iframe>
                                  
                              </div>
                              <div class="col-lg-5" >
                                   <iframe name='fra1' src='SubWall.jsp'  width="400" height="550" ></iframe>
                              </div>
                            </div>
                          </div>
                    </div>	
	</div>


                    

                </section>
            </section>
            <!-- END CONTENT -->
            

            <div class="chatapi-windows ">


            </div>    </div>
        <!-- END CONTAINER -->           


<%@ include file="Down.jsp" %>