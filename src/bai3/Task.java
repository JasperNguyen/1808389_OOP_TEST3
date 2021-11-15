/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

public class Task implements Comparable<Task> {
    public Task() {
    }
    
    public Task(String description, int priority) {
        this.description=description;
        this.priority=priority;
    }

    public Task(String description, int priority, int doPhucTap) {
        this.description = description;
        this.priority = priority;
        this.doPhucTap = doPhucTap;
    }
    
    @Override
    public String toString()
    {
        return String.format("Task [\n"
                + "    mo ta: %s,\n"
                + "    do uu tien: %s, \n"
                + "    do phuc tap: %s, \n"
                + "]",
                    description, priority, doPhucTap);
    }
    
    @Override
    public int compareTo(Task task) {
        int result = 0;
        
        // Sap xep theo do uu tien
        result = this.priority - task.priority;
        if(result != 0) return result;
        
        result = this.doPhucTap - task.doPhucTap;
        if(result != 0) return result;
        
        return result;
    }
    
    
    private String description;
    
    // Do uu tien
    private int priority;
    
    // Do phuc tap
    private int doPhucTap;
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getPriority() {
        return priority;
    }
    
    public void setPriority(int priority) {
        this.priority = priority;
    }
    
    

    public int getDoPhucTap() {
        return doPhucTap;
    }

    public void setDoPhucTap(int doPhucTap) {
        this.doPhucTap = doPhucTap;
    }
}
