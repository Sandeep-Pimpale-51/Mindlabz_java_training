/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.student.view;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ResultGenFrame extends javax.swing.JFrame {

    /**
     * Creates new form ResultGenFrame
     */
    public ResultGenFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblBanner = new javax.swing.JLabel();
        lblSuggest = new javax.swing.JLabel();
        txtSm1 = new javax.swing.JTextField();
        lblSub1 = new javax.swing.JLabel();
        txtSm2 = new javax.swing.JTextField();
        lblSub2 = new javax.swing.JLabel();
        txtSm3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lblSub3 = new javax.swing.JLabel();
        lblSub4 = new javax.swing.JLabel();
        lblSub5 = new javax.swing.JLabel();
        txtSm4 = new javax.swing.JTextField();
        txtSm5 = new javax.swing.JTextField();
        btnGen = new javax.swing.JButton();
        lblout = new javax.swing.JLabel();
        txtSn1 = new javax.swing.JTextField();
        txtSn2 = new javax.swing.JTextField();
        txtSn3 = new javax.swing.JTextField();
        txtSn4 = new javax.swing.JTextField();
        txtSn5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        lblSID = new javax.swing.JLabel();
        txtStudID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SchoolManagementSystem"));

        lblBanner.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        lblBanner.setText("      School Management System");

        lblSuggest.setText("Enter the Following Details to genrate Report Card....");

        lblSub1.setText("Subject1");

        lblSub2.setText("Subject2");

        jLabel5.setText("Marks");

        lblSub3.setText("Subject3");

        lblSub4.setText("Subject4");

        lblSub5.setText("Subject5");

        btnGen.setText("Genrate Result");
        btnGen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenActionPerformed(evt);
            }
        });

        lblout.setText(" ");

        txtSn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSn1ActionPerformed(evt);
            }
        });

        txtSn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSn5ActionPerformed(evt);
            }
        });

        jLabel10.setText("Subject Name");

        lblSID.setText("Student ID");

        btnBack.setText("To Main Menu");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 528, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSub1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSub2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSub3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSub4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtSn5)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtSn1)
                                    .addComponent(txtSn2)
                                    .addComponent(txtSn3)
                                    .addComponent(txtSn4)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(txtStudID, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSm4, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                                    .addComponent(txtSm5)
                                    .addComponent(txtSm2)
                                    .addComponent(txtSm3)
                                    .addComponent(txtSm1))
                                .addGap(171, 171, 171))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel5)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(lblSuggest, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(244, 244, 244)
                        .addComponent(btnGen)
                        .addGap(64, 64, 64)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblBanner)
                .addGap(19, 19, 19)
                .addComponent(lblSuggest, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSID, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtStudID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSm1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSub1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSn2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSm2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSub2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSn3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSm3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSn4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSm4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSub5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSm5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGen)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSn1ActionPerformed

    private void txtSn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSn5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSn5ActionPerformed

    private void btnGenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenActionPerformed
        // TODO add your handling code here:
         if(txtStudID.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please  Enter  Student ID");
        }
         if(txtSm1.getText().isEmpty()||txtSm2.getText().isEmpty()||txtSm3.getText().isEmpty()||txtSm4.getText().isEmpty()||txtSm5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please  Enter all Subject marks Fields");
        }
        if(txtSn1.getText().isEmpty()||txtSn2.getText().isEmpty()||txtSn3.getText().isEmpty()||txtSn4.getText().isEmpty()||txtSn5.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Please  Enter all Subject name Fields");
        }
        else{
            int StudID=Integer.parseInt(txtStudID.getText().trim());
            String SN1=txtSn1.getText().trim();
            String SN2=txtSn2.getText().trim();
            String SN3=txtSn3.getText().trim();
            String SN4=txtSn4.getText().trim();
            String SN5=txtSn5.getText().trim();
            
            int SM1=Integer.parseInt(txtSm1.getText().trim());
            int SM2=Integer.parseInt(txtSm2.getText().trim());
            int SM3=Integer.parseInt(txtSm3.getText().trim());
            int SM4=Integer.parseInt(txtSm4.getText().trim());
            int SM5=Integer.parseInt(txtSm5.getText().trim());
            
            int total=(SM1+SM2+SM3+SM4+SM5);
            float Avg=total/5;
            
            try {
			// load and establish conncetion to JDBC driver
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_school","root","root");  
			
                        String query="INSERT INTO `db_school`.`result` (`StudID`, `Sub1`, `Mark1`, `Sub2`, `Mark2`, `Sub3`, `Mark3`, `Sub4`, `Mark4`, `Sub5`, `Mark5`, `Total`, `Avg`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";
                        
                        PreparedStatement preparedStmt = con.prepareStatement(query);
		      
			  //load values from constructor to table columns
			  preparedStmt.setInt (1, StudID);
		      preparedStmt.setString (2,SN1 );
		      preparedStmt.setInt (3,SM1);
		      preparedStmt.setString (4,SN2 );
		      preparedStmt.setInt (5,SM2);
                       preparedStmt.setString (6,SN3 );
		      preparedStmt.setInt (7,SM3);
                       preparedStmt.setString (8,SN4 );
		      preparedStmt.setInt (9,SM4);
                       preparedStmt.setString (10,SN5 );
		      preparedStmt.setInt (11,SM5);
                      
		      preparedStmt.setInt (12,total);
		      preparedStmt.setFloat (13, Avg);

		      // execute the preparedstatement
		      preparedStmt.execute();
                      
                      Statement stmt=con.createStatement();
		      String getStudent="SELECT * FROM db_school.student where StudentID="+StudID;
                      String getMarks="SELECT * FROM db_school.result where StudID="+StudID;
                      ResultSet rs = stmt.executeQuery(getStudent);
			
			String name="demo",gender="M", address="A",ClassName="C";
                        float AdmissionFees=0;
                        while(rs.next()) {
				
				//load table data into variables
				name = rs.getString(2);
				gender=rs.getString(3);
                                address = rs.getString(4);
                                ClassName=rs.getString(5);
                                AdmissionFees=rs.getFloat(6);
				
			}
                       
                       String fileName = name+".txt";
                         PrintWriter outputfile= new PrintWriter(fileName);
		      //String Buffer to load info to file
		      StringBuilder str = new StringBuilder();
                      
                        str.append("\n  Report Card").append("\n Student ID = ").append(StudID).append("\n Name = ").append(name).append("\n Class = ").append(ClassName).append("\n\n\n      Subject Name \t").append("\t Marks Obtained ");
                        outputfile.append(str.toString());
                    System.out.println("ScoreCard1 is Genrated");
                       
                    Statement stmt1=con.createStatement();     
                   ResultSet rs1 = stmt1.executeQuery(getMarks);
		      String Sub1="",Sub2="",Sub3="",Sub4="",Sub5="";
                      int Mark1=0,Mark2=0,Mark3=0,Mark4=0,Mark5=0,Total=0;
                      float Avgs=0;
		      while(rs1.next()) {
                            Sub1=rs1.getString(3);
                            Mark1=rs1.getInt(4);
                            Sub2=rs1.getString(5);
                            Mark2=rs1.getInt(6);
                            Sub3=rs1.getString(7);
                            Mark3=rs1.getInt(8);
                            Sub4=rs1.getString(9);
                            Mark4=rs1.getInt(10);
                            Sub5=rs1.getString(11);
                            Mark5=rs1.getInt(12);
                            Total=rs1.getInt(13);
                            Avgs=rs1.getFloat(14);
                            
                      }
                      
                      
                      
		    	 
                             StringBuilder str1=new StringBuilder();    
		    	  //add transaction info
		    	  str1.append(" \t").append(Sub1).append("\t\t\t").append(Mark1).append("\n \t").append(Sub2).append("\t\t").append(Mark2).append("\n \t").append(Sub3).append("\t\t\t").append(Mark3).append("\n \t").append(Sub4).append("\t\t\t").append(Mark4).append("\n \t").append(Sub5).append("\t\t\t").append(Mark5).append("\t").append("\n\n\t Total = ").append(Total).append("\t\t Percentage = ").append(Avgs);
		    	  
		    	  outputfile.append("\n"+str1.toString());
		      
		    	 con.close(); 
                      outputfile.close();
                    
                      
                      lblout.setText("ScoreCard is Genrated");
                     
            }
            catch(FileNotFoundException | ClassNotFoundException | SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Please Enter valid Student ID");
            }
        }
    }//GEN-LAST:event_btnGenActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        setVisible(false); 
         new DashBoardFrame().setVisible(true);
         
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ResultGenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResultGenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResultGenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResultGenFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResultGenFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnGen;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBanner;
    private javax.swing.JLabel lblSID;
    private javax.swing.JLabel lblSub1;
    private javax.swing.JLabel lblSub2;
    private javax.swing.JLabel lblSub3;
    private javax.swing.JLabel lblSub4;
    private javax.swing.JLabel lblSub5;
    private javax.swing.JLabel lblSuggest;
    private javax.swing.JLabel lblout;
    private javax.swing.JTextField txtSm1;
    private javax.swing.JTextField txtSm2;
    private javax.swing.JTextField txtSm3;
    private javax.swing.JTextField txtSm4;
    private javax.swing.JTextField txtSm5;
    private javax.swing.JTextField txtSn1;
    private javax.swing.JTextField txtSn2;
    private javax.swing.JTextField txtSn3;
    private javax.swing.JTextField txtSn4;
    private javax.swing.JTextField txtSn5;
    private javax.swing.JTextField txtStudID;
    // End of variables declaration//GEN-END:variables
}
