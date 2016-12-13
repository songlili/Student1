<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
<rapid:override name="content">
    <div id="content" class="span10">

        <ul class="breadcrumb">
            <li>
                <i class="icon-home"></i>
                <a href="/index.jsp">Home</a>
                <i class="icon-angle-right"></i>
            </li>
            <li><a href="#">Dashboard</a></li>
        </ul>

        <div class="row-fluid">

            <a class="quick-button metro blue span2" href="<%=request.getContextPath()%>/viewteacher/teacher/list">
                <i class="icon-heart-empty"></i>
                <p>老师</p>
                <span class="badge"></span>
            </a>

            <a class="quick-button metro green span2" href="<%=request.getContextPath()%>/viewteacher/subject/list">
                <i class="icon-pencil"></i>
                <p>课程</p>
            </a>
            <a class="quick-button metro pink span2" href="<%=request.getContextPath()%>/viewteacher/qsas/list">
                <i class="icon-search"></i>
                <p>反馈和解决方案</p>
            </a>


            <div class="clearfix"></div>

        </div><!--/row-->

        <br/>
    </div><!--/#content.span10-->
    </div><!--/fluid-row-->
</rapid:override>
<%@ include file="/public/indexteacher.jsp" %>

