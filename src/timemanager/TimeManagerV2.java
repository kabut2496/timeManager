/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timemanager;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Karl Butler
 */
public class TimeManagerV2 extends javax.swing.JFrame {

    /**
     * Creates new form TimeManagerV2
     */
    public TimeManagerV2() {
        initComponents();
        start=0;
        end=0;
        num1=0;
        timeTotal=0;
        
      File fileName = new File("file_name.txt");
      
      FileWriter out;
      
      BufferedWriter writeFile;
      
      try{
      out = new FileWriter(fileName,true);
      writeFile = new BufferedWriter(out);
      Scanner input = new Scanner(fileName);
    
      
      
      while(input.hasNextLine()){
          nFile=input.nextLine();
          nNum=nFile+"_num";
          files.add(nFile);
      }
      

      writeFile.close();
      out.close();
          
      }catch(IOException e){
         
      }
        
        CurentFile.setText("The curent file u are righting to is "+ nFile);
        
    }
int start,end,num1,timeTotal;
String task;
String nFile="info";
String nNum="numbers";

ArrayList<String> tasksDone = new ArrayList<>();
ArrayList<String> files = new ArrayList<>();
ArrayList<Integer> time = new ArrayList<>();


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        startTime = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        endTime = new javax.swing.JTextField();
        inputTask = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        outPut = new javax.swing.JLabel();
        CurentFile = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        creatFile = new javax.swing.JMenuItem();
        chooseFile = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(66, 135, 245));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Time Manager");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 11, 113, -1));

        startTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startTimeActionPerformed(evt);
            }
        });
        jPanel1.add(startTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 126, -1));

        jLabel2.setText("Note enter all time in 24 hours and don't use :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 34, -1, -1));

        endTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endTimeActionPerformed(evt);
            }
        });
        jPanel1.add(endTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 126, -1));

        inputTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputTaskActionPerformed(evt);
            }
        });
        jPanel1.add(inputTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 130, 126, 30));

        jButton1.setText("Add Task");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        jButton2.setText("Out Put");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 180, -1, -1));

        jLabel3.setText("Enter start  time :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, -1));

        jLabel4.setText("Enter time finished :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 120, 20));

        jLabel5.setText(" Enter Task:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 110, 20));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 200, -1));
        jPanel1.add(outPut, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 190, 20));
        jPanel1.add(CurentFile, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 240, 260, 20));

        jMenu1.setText("File");

        creatFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        creatFile.setText("Creat New file");
        creatFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                creatFileActionPerformed(evt);
            }
        });
        jMenu1.add(creatFile);

        chooseFile.setText("Change File");
        chooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseFileActionPerformed(evt);
            }
        });
        jMenu1.add(chooseFile);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startTimeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
     int total=0,num2=1;
     String serch;
        
     File dataFile = new File(nFile+".txt");
     File numbers = new File(nNum+".txt");
     FileWriter out;
     FileWriter out2;
     
   
     BufferedWriter writeFile;
     BufferedWriter numbersWright;
     
     
     try {
			out = new FileWriter(dataFile,true);
			writeFile = new BufferedWriter(out);
                        
                        out2 = new FileWriter(numbers,true);
			numbersWright = new BufferedWriter(out2);
                        
                        Scanner input = new Scanner(dataFile);
                        Scanner input2 = new Scanner(numbers);
        String display = "";
        
        while(input.hasNextLine()){
       serch=input.nextLine();
            display+=serch+"\n";
            if(serch.contains("Entry")){
                num2++;
            }
        }
        
        
         while(input2.hasNextLine()){
        total+=Integer.parseInt(input2.nextLine());
        }
         
       
    display+= "Entry" +num2+":\n";
    
    for (int i=0;i<=num1-1;i++){
        
    display+="Task:"+(i+1) +" "+tasksDone.get(i) + " time for task "+time.get(i)+" minutes \n";        
    timeTotal=timeTotal +time.get(i); 
    
    
    }
 
     
        
    display+="\n"+"The total time worked for this input is " + timeTotal +" minutes \n";
    display+="The total time worked is "+(total+timeTotal)+"\n";
    JOptionPane.showMessageDialog(null, display);
    
    writeFile.write("Entry "+num2+":");
    writeFile.newLine();
    writeFile.write("Task:"+(num1) +" "+tasksDone.get(num1-1) + " time for task "+time.get(num1-1)+" minutes");
    writeFile.newLine();
    
    numbersWright.write(Integer.toString(timeTotal));
    numbersWright.newLine();
    
        
    
        writeFile.close();
        numbersWright.close();
        out.close();
        out2.close();
        System.exit(0);
        } catch (IOException e) {
            
        }
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int total;
      String checkST,checkET,checkTask,errorDisplay;
      
         checkST=startTime.getText();
         checkET=endTime.getText();
         checkTask=inputTask.getText();
         
                 
         if(checkST.equals("")||checkET.equals("")||checkTask.equals("")){
             errorDisplay= "please make sure all text boxes are full";
             JOptionPane.showMessageDialog(null, errorDisplay);
         }else{
         
      
      start=Integer.parseInt(startTime.getText());
      end=Integer.parseInt(endTime.getText());
      
        total= Time(start,end);
        
        task=inputTask.getText();
        
        tasksDone.add(task);
        time.add(total);
        
         num1++;
         
         outPut.setText("you have added " + num1 + " tasks");
         
         endTime.setText("");
         startTime.setText("");
         inputTask.setText("");
         }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void inputTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputTaskActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputTaskActionPerformed

    private void endTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_endTimeActionPerformed

    private void creatFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_creatFileActionPerformed
       
      nFile = JOptionPane.showInputDialog("Please input the name of the file you want to make.");
      nNum = nFile +"_num";
      CurentFile.setText("The curent file u are righting to is "+ nFile);
      
      File fileName = new File("file_name.txt");
      
      FileWriter out;
      
      BufferedWriter writeFile;
      
      try{
      out = new FileWriter(fileName,true);
      writeFile = new BufferedWriter(out);
      
      writeFile.write(nFile);
      
      
      
      writeFile.close();
      out.close();
          
      }catch(IOException e){
         
      }
      
      
      
    }//GEN-LAST:event_creatFileActionPerformed

    private void chooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseFileActionPerformed
        String aFiles="";
        String cFile,errorDisplay;
        int nFiles=0;
        
        files.add("info");
        
        
        
        for(int i =0; i<files.size();i++){
            nFiles++;
            aFiles+= nFiles+ ": " + files.get(i)+"\n";
            System.out.println(aFiles);
            
        }
       cFile= JOptionPane.showInputDialog("pleas enter the file u want to use from the list\n"+aFiles);
        
        if(cFile==null||cFile.equals("")){
            //this makes it so that nothing happends if the menue is closed or nothing is enterd
        }else if(files.contains(cFile)==false){
            errorDisplay="the file you enterd did not exist befor so a new file was made";
            JOptionPane.showMessageDialog(null, errorDisplay);
            nFile=cFile;
            nNum=nFile+"_num";
        }else if(cFile.equals("info")){
           nFile="info";
           nNum="numbers"; 
       }else{
        nFile=cFile;
        nNum=nFile+"_num";
        }
       CurentFile.setText("The curent file u are righting to is "+ nFile);
        
    }//GEN-LAST:event_chooseFileActionPerformed
    public int Time(int start, int end){
  int hourStart,hourEnd,hour,minT,total;
  double minStart,minEnd,nStart,nEnd,min;  
     nStart=start;
     nEnd=end;
     
      minStart=nStart/100;
      minEnd=nEnd/100; 
      hourStart=start/100;
      hourEnd=end/100;
      
      minStart=(minStart-hourStart)*100;
      minStart=Math.round(minStart);
      
      minEnd=(minEnd-hourEnd)*100;
      minEnd=Math.round(minEnd);
     
     hour=hourEnd-hourStart;
     min=minEnd-minStart;
     
     minT=(int)min;
     
     hour=hour*60;
     
     total=hour+minT;
     
     
     
      
    return total;
}
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
            java.util.logging.Logger.getLogger(TimeManagerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TimeManagerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TimeManagerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TimeManagerV2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TimeManagerV2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CurentFile;
    private javax.swing.JMenuItem chooseFile;
    private javax.swing.JMenuItem creatFile;
    private javax.swing.JTextField endTime;
    private javax.swing.JTextField inputTask;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outPut;
    private javax.swing.JTextField startTime;
    // End of variables declaration//GEN-END:variables
}
