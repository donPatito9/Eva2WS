/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;
import java.io.Serializable;
/**
 *
 * @author Robinson Concha
 */
public class Response implements Serializable {
    private int status;
    private Object data; 
    
    public Response(){
    }
    
    public Response(int status){
        this.status = status;
    }
    public Response(int status, Object data) {
        this.status = status;
        this.data = data;
    }
        public int getStatus(){
          return status;  
        }
        public void setStatus(int status) {
          this.status = status;  
        }
        public Object getData(){
            return data;
        }
        public void setData(Object data) {
            this.data = data;
        }

}

