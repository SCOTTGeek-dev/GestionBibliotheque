
package gestionbibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author Youness
 */
public class LivresRetour extends javax.swing.JFrame {

    
    public LivresRetour() {
        initComponents();
        AfficherEmprunts();
        AfficherRetours();
        MembreRetour.setEditable(false);
    }

      Connection Con = null;
PreparedStatement Pst=null;
ResultSet Rs,Rs1,Rs2 = null;
Statement St,St1,St2 = null;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TitreRetour = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        DateEmprunt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        EnregistrerRetourBtn = new javax.swing.JButton();
        ResetBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        DateRetour = new com.toedter.calendar.JDateChooser();
        RetourBtn = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        RetourTable = new javax.swing.JTable();
        MembreRetour = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableRetour = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\logo-emsi-entry(1).png")); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel2.setText("Système de gestion de bibliothèque");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(56, Short.MAX_VALUE))
        );

        TitreRetour.setEditable(false);
        TitreRetour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitreRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitreRetourActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Titre du livre");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Membres inscrits");

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Date a retourner");

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Date d'emprunt");

        DateEmprunt.setEditable(false);
        DateEmprunt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DateEmprunt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DateEmpruntActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setText("Livre  retournés");

        EnregistrerRetourBtn.setText("Retourner");
        EnregistrerRetourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerRetourBtnActionPerformed(evt);
            }
        });

        ResetBtn.setText("Réinitialiser");
        ResetBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetBtnActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));

        jLabel12.setText("Ecole Marocaine Des Sciences De L'ingénieur 2024 ©");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel9.setText("Livres réservés");

        jLabel11.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel11.setText("Livres retournés");

        RetourBtn.setText("Retour");
        RetourBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RetourBtnActionPerformed(evt);
            }
        });

        RetourTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Membre", "Livre", "Date "
            }
        ));
        RetourTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RetourTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(RetourTable);

        MembreRetour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MembreRetour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MembreRetourActionPerformed(evt);
            }
        });

        TableRetour.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Membre", "Livre", "Bibliothécaire", "Date Retour", "Date Emprunt"
            }
        ));
        TableRetour.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableRetourMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(TableRetour);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TitreRetour, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(DateEmprunt, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(DateRetour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(MembreRetour, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)))
                    .addComponent(jLabel8))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 120, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(727, 727, 727))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(EnregistrerRetourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)
                                .addGap(253, 253, 253))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(RetourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel9))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(44, 44, 44)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TitreRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(MembreRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(DateRetour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(DateEmprunt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(EnregistrerRetourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ResetBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(29, 29, 29)
                                .addComponent(RetourBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(72, 72, 72)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 544, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void TitreRetourActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void DateEmpruntActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

     int RId;
    private void CompterRetours(){
        
        try{
            St1= Con.createStatement();
            Rs1=St1.executeQuery("select Max(RetId) from retour_livre ");
            Rs1.next();
            RId=Rs1.getInt(1)+1;
        }catch(Exception e){
            
        }
              
    }
  private void AfficherRetours() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select * from retour_livre");
            TableRetour.setModel(DbUtils.resultSetToTableModel(Rs1));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }   
    
 private void QuantiteDisponible() {
	 try {
         St1 = Con.createStatement();
         Rs1 = St1.executeQuery("select Quantite from livre where livreID="+LivreID);
         TableRetour.setModel(DbUtils.resultSetToTableModel(Rs1));
         DispoLivre=Rs1.getInt(1);
     } catch (Exception e) {
         JOptionPane.showMessageDialog(this, e);
     }
	 
	 
 }
  
 
 private void SupprimerEmprunt() {
	 
	 try {
		 
		 Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "");
       String Query = "delete from reservation_livre where ResID="+RentID;
       Statement Del = Con.createStatement();
       Del.executeUpdate(Query);
		  
	 }catch(Exception e) {
		 
	 }
	 
 }
 
 
 
  
  int DispoLivre;
  private void MAJLivre() {
  	QuantiteDisponible();
  	try {
  		int NvQuantite = Integer.valueOf(DispoLivre)+1;
  		String UpdateQuery = "Update livre set Quantite=? where LivreID= ?";
  		Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
  		PreparedStatement Save=Con.prepareStatement(UpdateQuery);
  		Save.setInt(2,LivreID);
  		Save.setInt(1,NvQuantite);
  		
  		if(Save.executeUpdate() == 1) {
  			
  			//AfficherLivres();
  			JOptionPane.showMessageDialog(this,"Réservation mise à jour !!! ");
  			
  		}else {
  			
  			JOptionPane.showMessageDialog(this,"Erreur de mise à jour de la réservation !!! ");
 
  		}
  		
  		
  	}catch(Exception e) {
  		JOptionPane.showMessageDialog(this,e);
  	}
  	
  	
  	
  }
  
  
  
  
  
  
  
    
    private void EnregistrerRetourBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        
        if(RentID == -1){
            
            JOptionPane.showMessageDialog(this,"Sélectionner un livre !!!");
        }
else {
            CompterRetours();
            try{
               
               Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
               PreparedStatement Save = Con.prepareStatement("insert into retour_livre(RetID,MembreID,LivreID,BiblioID,DateRetour,DateReservation) values(?, ?, ?, ?, ? ,?)");

               Save.setInt(1, RentID);
               Save.setInt(2, MembreID);
               Save.setInt(3, Integer.valueOf(LivreID));
               Save.setInt(4, 1);
               String DateRet = DateRetour.getDate().toString().substring(0, 19);
               Save.setString(5, DateRet);
               String DateEmp = DateEmprunt.getText();
               Save.setString(6, DateEmp);

               
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Retour enregistré avec succés !");   
               Con.close();
               MAJLivre();
               SupprimerEmprunt();
               AfficherRetours();
               AfficherEmprunts();
               
               
              
          
           }catch(Exception ex) {
               
               JOptionPane.showMessageDialog(this,ex);   
           }
            
            
            
        }
        
        
        
    }                                                    

    private void ResetBtnActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        
private void AfficherEmprunts() {
        try {
            Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "");
            St1 = Con.createStatement();
            Rs1 = St1.executeQuery("select * from reservation_livre");
            RetourTable.setModel(DbUtils.resultSetToTableModel(Rs1));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }



    int MembreID;
	int LivreID;
	int RentID=-1;
    private void RetourTableMouseClicked(java.awt.event.MouseEvent evt) {                                         
           DefaultTableModel model = (DefaultTableModel) RetourTable.getModel();
   	    int MyIndex = RetourTable.getSelectedRow();
   	    LivreID = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
   	    MembreID = Integer.valueOf(model.getValueAt(MyIndex, 1).toString());
   	    RentID = Integer.valueOf(model.getValueAt(MyIndex, 2).toString());
   	    MembreRetour.setText(model.getValueAt(MyIndex, 1).toString());
   	    TitreRetour.setText(model.getValueAt(MyIndex, 2).toString());
   	    String EmpruntDate = model.getValueAt(MyIndex, 3).toString().substring(0,19);
   	    DateEmprunt.setText(EmpruntDate);
    }                                        

    private void MembreRetourActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void TableRetourMouseClicked(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void RetourBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        new MainMenu().setVisible(true);
        this.dispose();
    }                                         

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LivresRetour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivresRetour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivresRetour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivresRetour.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivresRetour().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JTextField DateEmprunt;
    private com.toedter.calendar.JDateChooser DateRetour;
    private javax.swing.JButton EnregistrerRetourBtn;
    private javax.swing.JTextField MembreRetour;
    private javax.swing.JButton ResetBtn;
    private javax.swing.JButton RetourBtn;
    private javax.swing.JTable RetourTable;
    private javax.swing.JTable TableRetour;
    private javax.swing.JTextField TitreRetour;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    // End of variables declaration                   
}
