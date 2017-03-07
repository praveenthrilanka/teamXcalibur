                <%@page import="org.sampath.filex.web.actions.Project"%>

                <%
                    session = request.getSession(false);
                %>
                    <ul class='wraplist'>	
                            <li class=""> 
                                <a href="<% out.print(session.getAttribute("home")); %>">
                                    <i class="fa fa-dashboard"></i>
                                    <span class="title">Home</span>
                                </a>
                            </li>
                    </ul>
                </div>
                <!-- MAIN MENU - END -->
            </div>
            <!--  SIDEBAR - END -->
