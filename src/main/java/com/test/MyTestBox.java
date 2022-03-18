package com.test;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.NotNull;

/**
 * @author 1
 */
public class MyTestBox extends AnAction {
    public MyTestBox() {
        super("Text_Boxes");
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        Project project = e.getProject();
        String name = Messages.showInputDialog(project, "What's your name", "Input Your Name", Messages.getQuestionIcon());
        Messages.showMessageDialog(project, "Hello, " + name, "Information", Messages.getInformationIcon());
    }
}
