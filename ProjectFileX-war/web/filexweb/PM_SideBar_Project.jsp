                <%@page import="org.sampath.filex.web.actions.Employee"%>
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
                    srsid="Uploaded";}
                    else
                    srsid="Not Uploaded";
                    }
                    catch(NullPointerException ex){
                    
                    }
                    %>  
                    
                        <li class="open"> <a> <i class="fa fa-folder-open"></i> <span class="title"><% out.print(p.getProjectname()); %></span></a>
                            <ul class="sub-menu">
                                <li > <a> <span class="title">Manager SD : <% out.print(Employee.getEmployee(p.getMsdid()).getEmployeename()); %></span></a> </li>
                                <li > <a> <span class="title">Project Manager : <% out.print(Employee.getEmployee(p.getPmid()).getEmployeename()); %></span></a> </li> 
                                <li > <a> <span class="title">Manager SD : <% out.print(Employee.getEmployee(p.getMsdid()).getEmployeename()); %></span></a> </li>
                                <li > <a> <span class="title">SRS Status : <% out.print(srsid); %></span> </a> </li>
                            </ul>
                    <%
                    }
                    %>
                            
                            
                        <li class=""> 
                            <a href="PM_Projects.jsp">
                                <i class="fa fa-dashboard"></i>
                                <span class="title">Home</span>
                            </a>
                        </li>
                        

                    </ul>

                </div>
                <!-- MAIN MENU - END -->


            </div>
            <!--  SIDEBAR - END -->
