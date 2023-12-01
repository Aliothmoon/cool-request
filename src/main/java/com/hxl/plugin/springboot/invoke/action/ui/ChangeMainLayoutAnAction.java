package com.hxl.plugin.springboot.invoke.action.ui;

import com.hxl.plugin.springboot.invoke.IdeaTopic;
import com.intellij.icons.AllIcons;
import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

public class ChangeMainLayoutAnAction extends AnAction {
    private final Project project;

    public ChangeMainLayoutAnAction(Project project) {
        super("Change Layout", "Change layout", AllIcons.Debugger.RestoreLayout);
        this.project = project;
    }

    @Override
    public void actionPerformed(@NotNull AnActionEvent e) {
        project.getMessageBus().syncPublisher(IdeaTopic.CHANGE_LAYOUT).event();

    }
}
