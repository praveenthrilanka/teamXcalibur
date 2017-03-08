<%@ include file="Up.jsp" %>
<%@ include file="Sidebar.jsp" %>
                    
        <% 
            String message = request.getParameter("message");
        %>
            <!-- START CONTENT -->
            <section id="main-content" class=" ">
                <section class="wrapper" style='margin-top:70px;display:inline-block;width:100%;padding:15px 0 0 15px;'>
			                   
                    <div class="row">
                        <div class="col-lg-12">        
                            
                            <div class="col-sm-1 col-md-1"></div>
                            <div class="col-sm-10 col-md-10">
                                <div class="alert alert-success"> <!--info/warning/danger-->                                

                                    <span class="glyphicon glyphicon-ok"></span><font size="5"><strong>Update Successfully..</strong></font>
                                    <hr class="message-inner-separator">
                                    
                                    <font size="3"><p><strong><% out.print(message); %></strong></p></font>
                                   
                                </div>
                            </div>
                            <div class="col-sm-1 col-md-1"></div>

                        </div>
                    </div>    
                    
                </section></section>>
                
               
<%@ include file="Down.jsp" %>