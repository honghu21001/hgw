package com.syj;

/** 
 * A simple return message for <a target="_blank" title="Ext JS" href="http://sencha.com/">Ext JS</a> 
 * 
 * @author Loiane Groner 
 * http://loiane.com 
 * http://loianegroner.com 
 */  
public class ExtJSFormResult {  
   
    private boolean success;  
   
    public boolean isSuccess() {  
        return success;  
    }  
    public void setSuccess(boolean success) {  
        this.success = success;  
    }  
   
    public String toString(){  
        return "{success:"+this.success+"}";  
    }  
}