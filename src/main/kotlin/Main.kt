package org.example

import java.sql.DriverManager.println

//TIP 要<b>运行</b>代码，请按 <shortcut actionId="Run"/> 或
// 点击装订区域中的 <icon src="AllIcons.Actions.Execute"/> 图标。
fun main() {
    val name = "Kotlin"
    //TIP 当文本光标位于高亮显示的文本处时按 <shortcut actionId="ShowIntentionActions"/>
    // 查看 IntelliJ IDEA 建议如何修正。
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP 按 <shortcut actionId="Debug"/> 开始调试代码。我们已经设置了一个 <icon src="AllIcons.Debugger.Db_set_breakpoint"/> 断点
        // 但您始终可以通过按 <shortcut actionId="ToggleLineBreakpoint"/> 添加更多断点。
        println("i = $i")
    }

    // Hello World 输出
    println("Hello, World!")
    println("Hello, Kotlin!")
    println("Hello, Git!")
    println("Hello, AI!")
    println("Hello, Developer!")

    println("Hello, World!")
    println("Hello, Kotlin!")
    println("Hello, Git!")
    println("Hello, AI!")
    println("Hello, Developer!")
    println("Hello, World!")
    println("Hello, Kotlin!")
    println("Hello, Git!")
    println("Hello, AI!")
    println("Hello, Developer!")

    // 新增代码
    val greeting = "Welcome"
    val target = "to Kotlin!"
    println("$greeting $target")
    println("Code is fun!")
    println("Let's keep coding!")

    println("入类编写的代码1")
    println("入类编写的代码2")
    println("入类编写的代码3")

    println("Hello, Kotlin!")
    println("Hello, Git!")
    println("Hello, AI!")
    println("Hello, Developer!")

    // git-ai 测试代码 - 2026-03-17
    println("AI generated line 1")
    println("AI generated line 2")
    println("AI generated line 3")
    println("AI generated line 4")
    println("修改上一个commit")

    println("通过终端修正上一次提交")

    println("回退版本至v1.1.1的第一次正常提交")
}
