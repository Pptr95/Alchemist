package it.unibo.alchemist.boundary.projectview.model;

import java.util.List;

/**
 * 
 *
 */
public class BatchImpl implements Batch {

    private boolean select;
    private List<String> variables;
    private int thread;

    @Override
    public int getThreadCount() {
        return this.thread;
    }

    @Override
    public List<String> getVariables() {
        return this.variables;
    }

    @Override
    public boolean isSelected() {
        return this.select;
    }

    @Override
    public void setThreadCount(final int thread) {
        this.thread = thread;
    }

    @Override
    public void setVariables(final List<String> var) {
        this.variables = var;
    }

    @Override
    public void setSelected(final boolean sel) {
        this.select = sel;
    }

}
