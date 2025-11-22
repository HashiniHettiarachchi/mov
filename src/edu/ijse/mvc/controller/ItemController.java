/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc.controller;

import edu.ijse.mvc.dto.ItemDto;
import edu.ijse.mvc.model.ItemModel;
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class ItemController {
    private ItemModel itemModel = new ItemModel();
    
    public String saveItem(ItemDto itemDto) throws Exception{
        return itemModel.saveItem(itemDto);
    }
    
    public ArrayList<ItemDto> getAll() throws Exception{
        ArrayList<ItemDto> dtos = itemModel.getAll();
        return dtos;
    }
    
    public ItemDto searchItem(String code) throws Exception{
        return itemModel.search(code);
    }
    
}
    

