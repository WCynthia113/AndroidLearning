package com.example.treelayoutdemo.treeview

import java.io.Serializable

/**
 * {
"returnCode":0,
"returnMessage":"succeed",
"data":{
"id":36013,
"name":"超级指令4.3.0版本按时发布",
"startTime":"2020/07/02 09:00",
"endTime":"2020/08/28 18:38",
"percent":0,
"level":1,
"liableUsername":"陈昕",
"priority":0,
"status":0,
"flag":0,
"subtaskNum":8,
"approval":0,
"isPrivate":0,
"icon":"face-4",
"cycleNum":-1,
"executeTime":null,
"parentId":null,
"tagList":null,
"chlids":[
{
"id":36014,
"name":"4.3.0版本测试执行",
"startTime":"2020/07/02 09:00",
"endTime":"2020/08/28 18:38",
"percent":0,
"level":2,
"liableUsername":"沈燕玲",
"priority":0,
"status":0,
"flag":0,
"subtaskNum":43,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###",
"tagList":null,
"chlids":[
{
"id":36513,
"name":"【OA-测试计划】7月第2周",
"startTime":"2020/07/06 09:00",
"endTime":"2020/07/10 18:30",
"percent":0,
"level":3,
"liableUsername":"沈燕玲",
"priority":0,
"status":3,
"flag":0,
"subtaskNum":19,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-06 20:54:55.0",
"parentId":"###36013###36014###",
"tagList":null,
"chlids":[

],
"today":false
},
{
"id":38219,
"name":"【OA-测试计划】7月第3周",
"startTime":"2020/07/13 09:00",
"endTime":"2020/07/18 18:30",
"percent":0,
"level":3,
"liableUsername":"沈燕玲",
"priority":0,
"status":0,
"flag":0,
"subtaskNum":22,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###36014###",
"tagList":null,
"chlids":[

],
"today":false
}
],
"today":false
},
{
"id":36017,
"name":"平台组4.3.0研发执行",
"startTime":"2020/07/02 09:00",
"endTime":"2020/08/28 18:38",
"percent":0,
"level":2,
"liableUsername":"冯佳",
"priority":0,
"status":1,
"flag":0,
"subtaskNum":48,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-03 21:19:41.0",
"parentId":"###36013###",
"tagList":null,
"chlids":[
{
"id":36029,
"name":"【研发任务】第一轮",
"startTime":"2020/07/02 09:00",
"endTime":"2020/07/10 18:30",
"percent":0,
"level":3,
"liableUsername":"冯佳",
"priority":0,
"status":2,
"flag":0,
"subtaskNum":22,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-13 15:27:52.0",
"parentId":"###36013###36017###",
"tagList":null,
"chlids":[

],
"today":false
},
{
"id":38307,
"name":"【研发任务】第二轮",
"startTime":"2020/07/13 09:00",
"endTime":"2020/07/18 18:30",
"percent":0,
"level":3,
"liableUsername":"冯佳",
"priority":0,
"status":0,
"flag":0,
"subtaskNum":24,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###36017###",
"tagList":null,
"chlids":[

],
"today":false
}
],
"today":false
},
{
"id":36022,
"name":"移动端4.3.0研发执行",
"startTime":"2020/07/02 09:00",
"endTime":"2020/08/28 18:38",
"percent":0,
"level":2,
"liableUsername":"刘明艺",
"priority":0,
"status":0,
"flag":0,
"subtaskNum":1,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###",
"tagList":null,
"chlids":[
{
"id":37391,
"name":"7月第一周",
"startTime":"2020/07/07 09:00",
"endTime":"2020/07/10 18:38",
"percent":0,
"level":3,
"liableUsername":"刘明艺",
"priority":0,
"status":3,
"flag":0,
"subtaskNum":28,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###36022###",
"tagList":null,
"chlids":[

],
"today":false
}
],
"today":false
},
{
"id":36024,
"name":"子产品4.3.0研发执行",
"startTime":"2020/07/02 09:00",
"endTime":"2020/08/28 18:38",
"percent":0,
"level":2,
"liableUsername":"谢英亮",
"priority":0,
"status":1,
"flag":0,
"subtaskNum":47,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-03 00:11:33.0",
"parentId":"###36013###",
"tagList":null,
"chlids":[
{
"id":36071,
"name":"研发第一轮",
"startTime":"2020/07/02 09:00",
"endTime":"2020/07/04 18:38",
"percent":0,
"level":3,
"liableUsername":"谢英亮",
"priority":0,
"status":2,
"flag":0,
"subtaskNum":7,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-06 09:59:33.0",
"parentId":"###36013###36024###",
"tagList":null,
"chlids":[

],
"today":false
},
{
"id":36082,
"name":"研发第二轮",
"startTime":"2020/07/06 09:00",
"endTime":"2020/07/10 18:38",
"percent":0,
"level":3,
"liableUsername":"谢英亮",
"priority":0,
"status":2,
"flag":0,
"subtaskNum":18,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":"2020-07-13 15:58:33.0",
"parentId":"###36013###36024###",
"tagList":null,
"chlids":[

],
"today":false
},
{
"id":38345,
"name":"研发第三轮",
"startTime":"2020/07/13 09:00",
"endTime":"2020/07/17 18:38",
"percent":0,
"level":3,
"liableUsername":"谢英亮",
"priority":0,
"status":3,
"flag":0,
"subtaskNum":19,
"approval":0,
"isPrivate":0,
"icon":null,
"cycleNum":-1,
"executeTime":null,
"parentId":"###36013###36024###",
"tagList":null,
"chlids":[

],
"today":false
}
],
"today":false
}
],
"today":false
},
"obj":null,
"dataList":null
}
 */
data class TaskModel(
    val id: Int,
    val name: String,
    val startTime: String,
    val endTime: String,
    val percent: Int,
    val level: Int,
    val liableUsername: String,
    val priority: Int,
    val status: Int,
    val flag: Int,
    val subtaskNum: Int,
    val approval: Int,
    val isPrivate: Int,
    val icon: Any?,
    val cycleNum: Int,
    val executeTime: String,
    val parentId: String,
    val tagList: Any?,
    val chlids: List<TaskModel>,
    val today: Boolean
){
    override fun toString(): String {
        return name
    }
}