<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.rapid-framework.org.cn/rapid" prefix="rapid" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<rapid:override name="content">
    <div id="content" class="span10">


        <ul class="breadcrumb">
            <li>
                <i class="icon-home"></i>
                <a href="/index.jsp">Home</a>
                <i class="icon-angle-right"></i>
            </li>
            <li><a href="#">Tables</a></li>
        </ul>

        <div class="row-fluid sortable">
            <div class="box span12">
                <div class="box-header" data-original-title>
                    <h2><i class="halflings-icon user"></i><span class="break"></span>Members</h2>
                    <div class="box-icon">
                        <a href="#" class="btn-setting"><i class="halflings-icon wrench"></i></a>
                        <a href="#" class="btn-minimize"><i class="halflings-icon chevron-up"></i></a>
                        <a href="#" class="btn-close"><i class="halflings-icon remove"></i></a>
                    </div>
                </div>
                <div class="box-content">
                    <table class="table table-striped table-bordered bootstrap-datatable datatable">
                        <thead>
                        <tr>
                            <th>ID</th>
                            <th>反馈问题</th>
                            <th>解决办法</th>
                            <th>操作</th>
                        </tr>fnSetData
                        </thead>

                        <tbody>

                        <s:iterator value='#session.arraylist' var="v">
                            <tr>
                                <td><s:property value='#v.id'/></td>
                                <td><s:property value='#v.question'/></td>
                                <td><s:property value='#v.answer'/></td>
                                <td class="center">
                                    <a class="btn btn-success" href="<%=request.getContextPath()%>/view/qsas/profile.jsp">
                                        <i class="halflings-icon white edit"></i>
                                    </a>

                                    <a class="btn btn-danger" href="<%=request.getContextPath()%>/qsas/delete?id=<s:property value='#v.id'/>">
                                        <i class="halflings-icon white trash"></i>
                                    </a>
                                </td>

                            </tr>
                        </s:iterator>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</rapid:override>
<%@ include file="/public/index.jsp" %>