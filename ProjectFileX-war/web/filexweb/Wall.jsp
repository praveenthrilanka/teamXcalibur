<%@ include file="Up.jsp" %>
<%@ include file="SideBar_Project.jsp" %>
            
            <%
            
                if(session.getAttribute("pno")==null){
                    //response.sendRedirect("message.jsp?message=Sorry, Selected project is not available.");
                }        
            
            %>
            
            
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:25px;display:inline-block;width:100%;height: 100%; padding:15px 0 0 15px;'>
                   
		<div id="pageset">
                    <div class="main-page">
                            <div class="container-fluid">
                            <br/>
                            <a title="Full Screen" target="_blank" href="../GetFile"><img src="logos/full.png" height="33" width="33" align="right"></a>
                             <div class="row">
                                 <br/>
                                 <div class="col-lg-7"  >
                                     <iframe style='margin-top:10px'  name='fra2' src='../GetFile' width="100%" height="550" ></iframe>
                                  
                              </div>
                              <div class="col-lg-5" >
                                   <iframe name='fra1' src='SubWall.jsp'  width="100%" height="550" ></iframe>
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