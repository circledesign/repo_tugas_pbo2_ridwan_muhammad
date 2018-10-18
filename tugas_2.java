
package pbo2;

import javax.swing.*;
import java.awt.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
class AplikasiEvent5 extends JFrame {
    
    JLabel lbljudul=new JLabel("TOKO BAJU");
    JLabel lblnama=new JLabel("Nama Pemesan");
    JTextField txnama=new JTextField(20);    
    JLabel lblj=new JLabel("Jumlah");
    JTextField txj=new JTextField(5);    
    JLabel lblkode=new JLabel("Kode Baju");    
    JTextField txkode=new JTextField(7);    
    
    JLabel lbljenis=new JLabel("Jenis Baju");    
    JRadioButton kaos=new JRadioButton("Kaos");    
    JRadioButton kemeja=new JRadioButton("Kemeja");
    JRadioButton jaket=new JRadioButton("Jaket");
    JRadioButton jas=new JRadioButton("Jas");    
    ButtonGroup jenis=new ButtonGroup();    
    
    JLabel lblukuran=new JLabel("Ukuran");    
    JCheckBox s=new JCheckBox("S");    
    JCheckBox m=new JCheckBox("M");    
    JCheckBox l=new JCheckBox("L");    
    JCheckBox xl=new JCheckBox("XL");    
    JButton cetak=new JButton("Cetak");    
    JTextArea hasil=new JTextArea(); 
  
 
   AplikasiEvent5()    {       
       setTitle("TOKO BAJU");
       setLocation(400,60);       
       setSize(600,650);       
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
   } 
 
   void KomponenVisual()    
   {       
       getContentPane().setLayout(null);
       
       getContentPane().add(lbljudul);
       lbljudul.setBounds(250,20,200,20);       
       getContentPane().add(lblnama);       
       lblnama.setBounds(150,50,120,20);       
       getContentPane().add(txnama);       
       txnama.setBounds(260,50,175,20);       
       getContentPane().add(lblkode);       
       lblkode.setBounds(150,85,80,20);       
       getContentPane().add(txkode);       
       txkode.setBounds(260,85,70,20);
       getContentPane().add(lblj);       
       lblj.setBounds(150,210,120,20);  
       getContentPane().add(lbljenis); 
       getContentPane().add(txj);       
       txj.setBounds(260,210,50,20);   
       
       lbljenis.setBounds(150,120,80,20);       
       jenis.add(kaos);       
       jenis.add(kemeja);     
       jenis.add(jaket);     
       jenis.add(jas);      
       getContentPane().add(kaos);      
       kaos.setBounds(260,120,100,20);       
       getContentPane().add(kemeja); 
       kemeja.setBounds(260,140,100,20);       
       getContentPane().add(jaket); 
       jaket.setBounds(260,160,70,20);       
       getContentPane().add(jas); 
       jas.setBounds(260,180,70,20); 
       
       getContentPane().add(lblukuran);       
       lblukuran.setBounds(150,240,100,20);       
       getContentPane().add(s);       
       s.setBounds(260,240,40,20);       
       getContentPane().add(m);       
       m.setBounds(300,240,40,20);       
       getContentPane().add(l);       
       l.setBounds(340,240,40,20);       
       getContentPane().add(xl);       
       xl.setBounds(380,240,40,20);       
       
       getContentPane().add(cetak);       
       cetak.setBounds(260,290,100,50);       
       getContentPane().add(hasil);       
       hasil.setBounds(150,370,300,200);       
       setVisible(true);    
   } 
 
   void AksiReaksi()   
   {
       cetak.addActionListener(new ActionListener()               
       {
       public void actionPerformed(ActionEvent e)          
       {
       hasil.append("========= STRUK PEMESANAN BAJU =========== \n");
       hasil.append("\n   Nama Pemesan   : "+txnama.getText()+"\n");  
       hasil.append("   Kode Baju      : "+txkode.getText()+"\n");            
       hasil.append("   Jumlah Pesanan : "+txj.getText()+"\n");
       
       if(kaos.isSelected()==true)             
       {                
            hasil.append("   Jenis Baju : "+kaos.getText()+"\n");            
       }    
       else if(kemeja.isSelected()==true)        
       {                
            hasil.append("   Jenis Baju : "+kemeja.getText()+"\n");             
       }  
       else if(jaket.isSelected()==true)                    
       {                
            hasil.append("   Jenis Baju : "+jaket.getText()+"\n");             
       }
       else                    
       {                
            hasil.append("   Jenis Baju : "+jas.getText()+"\n");             
       }
       
            if(s.isSelected()==true)            
       {               
            hasil.append("   Ukuran Baju : "+s.getText()+"\n");             
       }      
            if(m.isSelected()==true)             
       {  
            hasil.append("   Ukuran Baju : "+m.getText()+"\n");             
       }         
            if(l.isSelected()==true)             
       {           
            hasil.append("   Ukuran Baju : "+l.getText()+"\n");             
       }    
            if(xl.isSelected()==true)             
       {           
            hasil.append("   Ukuran Baju : "+xl.getText()+"\n");             
       } 
        hasil.append("\n =============== TERIMA KASIH ===============");    
       }       
       });    
   } 
 
   public static void main(String args[])    {       
       AplikasiEvent5 e5=new AplikasiEvent5();       
       e5.KomponenVisual();       
       e5.AksiReaksi();    
   } 
} 
