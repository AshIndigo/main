package com.alloycraft.exxo.models;                                                                          

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
                                                                                                    
public class ModelProjectX extends ModelBase                                                                
{                                                                                                                                                                                
                                                                                                    
    public ModelProjectX()                                                                                  
    {                                                                                               
        this.textureWidth = 32;                                                                   
        this.textureHeight = 32;                                                                  
                                                                                                    
                                                                                     
                                                                                          
    }                                                                                               
                                                                                                    
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)    
    {                                                                                               
        super.render(entity, f, f1, f2, f3, f4, f5);                                                
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);                                      
                                                                                            
    }                                                                                               
                                                                                                    
    private void setRotation(ModelRenderer model, float x, float y, float z)                        
    {                                                                                               
        model.rotateAngleX = x;                                                                     
        model.rotateAngleY = y;                                                                     
        model.rotateAngleZ = z;                                                                     
    }                                                                                               
                                                                                                    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)        
    {                                                                                               
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);                                     
    }                                                                                               
}