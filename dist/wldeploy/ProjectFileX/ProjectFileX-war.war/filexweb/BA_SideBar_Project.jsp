                <%@page import="org.sampath.filex.web.actions.Project"%>

                <ul class='wraplist'>	
                        
                    <%
                    String pno=(String)session.getAttribute("pno");
                    if(pno!=null){
                    Project p=Project.getProject(pno);
                    String srsid="Not Uploaded";
                    try{
                    if(p.getSrsid()!=null){
                    session.setAttribute("srsid", p.getSrsid() );
                    srsid=p.getSrsid();}
                    else
                    srsid="Not Uploaded";
                    }
                    catch(NullPointerException ex){
                    
                    }
                    %>  
                    
                        <li class="open"> <a> <i class="fa fa-folder-open"></i> <span class="title"><% out.print(p.getProjectname()); %></span></a>
                            <ul class="sub-menu">
                                <li > <a> <span class="title">SRS ID : <% out.print(srsid); %></span> </a> </li>
                            </ul>
                    <%
                    }
                    %>
                            
                            <br/><br/>
                        <li class=""> 
                            <a href="BA_Projects.jsp">
                                <i class="fa fa-dashboard"></i>
                                <span class="title">Home</span>
                            </a>
                        </li>
                        

                    </ul>

                </div>
                <!-- MAIN MENU - END -->


            </div>
            <!--  SIDEBAR - END -->
