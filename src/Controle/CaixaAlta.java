/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author Administrador
 */
import javax.swing.text.AttributeSet;  
import javax.swing.text.BadLocationException;  
import javax.swing.text.PlainDocument;  
  
public class CaixaAlta extends PlainDocument {  
  
    public void insertString(int offset, String str, AttributeSet attr)  
            throws BadLocationException {  
        if (str == null)  
            return;  
        super.insertString(offset, str.toUpperCase(), attr); // Detalhe no str  
    }  
  
}  