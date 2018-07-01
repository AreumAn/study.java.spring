<%@ include file="./include/header.jsp"%>
<%@ include file="./include/navigation.jsp"%>
<section class="content">
            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-xs-12 col-md-8">
                        <div class="empty-h-20px"></div>
                    </div>
                </div>
            </div>


            <div class="container">
                <div class="row">
                    <div class="col-lg-8 col-md-8">



                        <!-- POST -->
                        <div class="post">
                            <form action="#" class="form newtopic" method="post">
                                <div class="topwrap">
                                    <div class="userinfo pull-left">
                                        <div class="avatar">
                                            <img src="/resources/images/avatar4.jpg" alt="" />
                                        </div>

                                        <div class="icons">
                                            <img src="images/icon3.jpg" alt="" />
                                            <img src="images/icon4.jpg" alt="" />
                                            <img src="images/icon5.jpg" alt="" />
                                            <img src="images/icon6.jpg" alt="" />
                                        </div>
                                    </div>
                                    <div class="posttext pull-left">

                                        <div>
                                            <input type="text" placeholder="Enter Topic Title" name="title" class="form-control" />
                                        </div>

                                        <div class="row">
                                            <div class="col-lg-12 col-md-12">
                                                <select name="category" id="category" class="form-control">
                                                    <option value="" disabled selected>Select Category</option>
                                                    <c:forEach items="${categorylist}" var="category">
                                                    <option value="${category.cName}">${category.cName}</option>
                                                    </c:forEach>
                                                </select>
                                            </div>
                                        </div>

                                        <div>
                                            <textarea id="desc" placeholder="Description" name="description" class="form-control"></textarea>
                                        </div>


                                    </div>
                                    <div class="clearfix"></div>
                                </div>
                                <div class="postinfobot">

                                    <div class="notechbox pull-left">
                                        <input type="checkbox" name="note" id="note" class="form-control" />
                                    </div>

                                    <div class="pull-left">
                                        <label for="note"> Email me when some one post a reply</label>
                                    </div>

                                    <div class="pull-right postreply">
                                        <div class="pull-left smile">
                                            <a href="#">
                                                <i class="fa fa-smile-o"></i>
                                            </a>
                                        </div>
                                        <div class="pull-left">
                                            <button type="submit" class="btn btn-primary">Post</button>
                                        </div>
                                        <div class="clearfix"></div>
                                    </div>


                                    <div class="clearfix"></div>
                                </div>
                            </form>
                        </div>
                        <!-- POST -->
                    </div>

                    <%@ include file="./include/sidebar.jsp"%>
                </div>
            </div>




        </section>
        
 <%@ include file="./include/footer.jsp"%>