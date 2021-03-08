/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testpoopy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tobin
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        tabbedPane = new javax.swing.JTabbedPane();
        panel_Welcome = new javax.swing.JPanel();
        textField_Welcome_Email = new javax.swing.JTextField();
        textField_Welcome_Password = new javax.swing.JTextField();
        label_Welcome_Email = new javax.swing.JLabel();
        label_Welcome_Password = new javax.swing.JLabel();
        button_Welcome_Login = new javax.swing.JButton();
        panel_Student = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_Student_Attendence = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_Student_Absence = new javax.swing.JTable();
        button_Student_Dispute = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        label_Student_StudentName = new javax.swing.JLabel();
        label_Student_ClassName = new javax.swing.JLabel();
        button_Student_LogOut = new javax.swing.JButton();
        label_Student_Time = new javax.swing.JLabel();
        label_Student_Date = new javax.swing.JLabel();
        panel_Instructor = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        table_Instructor_Absence = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        button_Instructor_MarkIncorrect = new javax.swing.JButton();
        combo_Instructor_FilterCourse = new javax.swing.JComboBox<>();
        combo_Instructor_FilterStudent = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        combo_Instructor_SelectCourse = new javax.swing.JComboBox<>();
        combo_Instructor_SelectStudent = new javax.swing.JComboBox<>();
        combo_Instructor_SelectDate = new javax.swing.JComboBox<>();
        button_Instructor_Save = new javax.swing.JButton();
        panel_Admin = new javax.swing.JPanel();
        panel_Test = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        panel_Test_StudentList = new javax.swing.JScrollPane();
        table_Test_StudentList = new javax.swing.JTable();
        button_Test_Refresh = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(900, 600));
        setResizable(false);

        label_Welcome_Email.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        label_Welcome_Email.setText("School Email");

        label_Welcome_Password.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        label_Welcome_Password.setText("Password");

        button_Welcome_Login.setText("Log In");

        javax.swing.GroupLayout panel_WelcomeLayout = new javax.swing.GroupLayout(panel_Welcome);
        panel_Welcome.setLayout(panel_WelcomeLayout);
        panel_WelcomeLayout.setHorizontalGroup(
            panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_WelcomeLayout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addGroup(panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_Welcome_Email, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_Welcome_Password, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_Welcome_Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textField_Welcome_Email)
                    .addComponent(textField_Welcome_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(357, Short.MAX_VALUE))
        );
        panel_WelcomeLayout.setVerticalGroup(
            panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_WelcomeLayout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Welcome_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Welcome_Email))
                .addGap(18, 18, 18)
                .addGroup(panel_WelcomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField_Welcome_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_Welcome_Password))
                .addGap(18, 18, 18)
                .addComponent(button_Welcome_Login)
                .addContainerGap(242, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Welcome", panel_Welcome);

        table_Student_Attendence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "Room/Bldg", "Timestamp"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table_Student_Attendence);
        if (table_Student_Attendence.getColumnModel().getColumnCount() > 0) {
            table_Student_Attendence.getColumnModel().getColumn(0).setResizable(false);
            table_Student_Attendence.getColumnModel().getColumn(1).setResizable(false);
            table_Student_Attendence.getColumnModel().getColumn(2).setResizable(false);
        }

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel6.setText("Attendence Record");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        jLabel7.setText("Absence Record");

        table_Student_Absence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Course Name", "Room/Bldg", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_Student_Absence);
        if (table_Student_Absence.getColumnModel().getColumnCount() > 0) {
            table_Student_Absence.getColumnModel().getColumn(0).setResizable(false);
            table_Student_Absence.getColumnModel().getColumn(1).setResizable(false);
            table_Student_Absence.getColumnModel().getColumn(2).setResizable(false);
        }

        button_Student_Dispute.setForeground(new java.awt.Color(255, 51, 51));
        button_Student_Dispute.setText("Dispute");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setText("Your attendence has been recorded.");

        label_Student_StudentName.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        label_Student_StudentName.setText("Student Name");

        label_Student_ClassName.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        label_Student_ClassName.setText("Class Name");

        button_Student_LogOut.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_Student_LogOut.setText("Log Out");

        label_Student_Time.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        label_Student_Time.setText("12:12 PM");

        label_Student_Date.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        label_Student_Date.setText("12/31/2021");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(button_Student_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Student_StudentName)
                            .addComponent(label_Student_ClassName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_Student_Time, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_Student_Date, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Student_StudentName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Student_ClassName))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label_Student_Date)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label_Student_Time)))
                .addGap(18, 18, 18)
                .addComponent(button_Student_LogOut, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_StudentLayout = new javax.swing.GroupLayout(panel_Student);
        panel_Student.setLayout(panel_StudentLayout);
        panel_StudentLayout.setHorizontalGroup(
            panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_StudentLayout.createSequentialGroup()
                .addGroup(panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_StudentLayout.createSequentialGroup()
                        .addGap(363, 363, 363)
                        .addGroup(panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(button_Student_Dispute, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_StudentLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_StudentLayout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_StudentLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addGap(206, 206, 206)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_StudentLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(217, 217, 217))
        );
        panel_StudentLayout.setVerticalGroup(
            panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_StudentLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_StudentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Student_Dispute)
                .addContainerGap())
        );

        tabbedPane.addTab("Student", panel_Student);

        table_Instructor_Absence.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Course Name", "Course Days", "Student Name", "Date Absent"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(table_Instructor_Absence);
        if (table_Instructor_Absence.getColumnModel().getColumnCount() > 0) {
            table_Instructor_Absence.getColumnModel().getColumn(0).setResizable(false);
            table_Instructor_Absence.getColumnModel().getColumn(1).setResizable(false);
            table_Instructor_Absence.getColumnModel().getColumn(2).setResizable(false);
            table_Instructor_Absence.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("Absence Records For Your Classes");

        button_Instructor_MarkIncorrect.setForeground(new java.awt.Color(255, 51, 51));
        button_Instructor_MarkIncorrect.setText("Mark as incorrect");

        combo_Instructor_FilterCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by Course Name" }));

        combo_Instructor_FilterStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Filter by Student Name" }));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("Record New Absence");

        combo_Instructor_SelectCourse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Course" }));

        combo_Instructor_SelectStudent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Student" }));

        combo_Instructor_SelectDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Date" }));

        button_Instructor_Save.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        button_Instructor_Save.setText("Save");

        javax.swing.GroupLayout panel_InstructorLayout = new javax.swing.GroupLayout(panel_Instructor);
        panel_Instructor.setLayout(panel_InstructorLayout);
        panel_InstructorLayout.setHorizontalGroup(
            panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_InstructorLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_InstructorLayout.createSequentialGroup()
                        .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InstructorLayout.createSequentialGroup()
                                .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combo_Instructor_SelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_Instructor_SelectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_Instructor_SelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(panel_InstructorLayout.createSequentialGroup()
                                .addComponent(button_Instructor_Save, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                .addGap(108, 108, 108)))
                        .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(button_Instructor_MarkIncorrect, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGroup(panel_InstructorLayout.createSequentialGroup()
                                .addComponent(combo_Instructor_FilterCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(131, 131, 131)
                                .addComponent(combo_Instructor_FilterStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(panel_InstructorLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addGap(132, 132, 132))))
        );
        panel_InstructorLayout.setVerticalGroup(
            panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_InstructorLayout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_Instructor_FilterCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_Instructor_FilterStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_InstructorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_InstructorLayout.createSequentialGroup()
                        .addComponent(combo_Instructor_SelectCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_Instructor_SelectStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(combo_Instructor_SelectDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(button_Instructor_Save)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(button_Instructor_MarkIncorrect)
                .addGap(15, 15, 15))
        );

        tabbedPane.addTab("Instructor", panel_Instructor);

        javax.swing.GroupLayout panel_AdminLayout = new javax.swing.GroupLayout(panel_Admin);
        panel_Admin.setLayout(panel_AdminLayout);
        panel_AdminLayout.setHorizontalGroup(
            panel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
        );
        panel_AdminLayout.setVerticalGroup(
            panel_AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        tabbedPane.addTab("Admin", panel_Admin);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("This page is used to test features");

        table_Test_StudentList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Account Type"
            }
        ));
        panel_Test_StudentList.setViewportView(table_Test_StudentList);

        button_Test_Refresh.setText("Refresh");
        button_Test_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_Test_RefreshActionPerformed(evt);
            }
        });

        jLabel3.setText("Display list of students");

        javax.swing.GroupLayout panel_TestLayout = new javax.swing.GroupLayout(panel_Test);
        panel_Test.setLayout(panel_TestLayout);
        panel_TestLayout.setHorizontalGroup(
            panel_TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TestLayout.createSequentialGroup()
                .addContainerGap(335, Short.MAX_VALUE)
                .addGroup(panel_TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_TestLayout.createSequentialGroup()
                        .addComponent(button_Test_Refresh)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(panel_Test_StudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );
        panel_TestLayout.setVerticalGroup(
            panel_TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TestLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(panel_TestLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_Test_Refresh)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_Test_StudentList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        tabbedPane.addTab("Test", panel_Test);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabbedPane)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button_Test_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_Test_RefreshActionPerformed
        fillTable(table_Test_StudentList, "SELECT * FROM USER");
    }//GEN-LAST:event_button_Test_RefreshActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    
    /**
     * Populates the given table with the results of the provided query
     * @param table
     * @param query 
     */
    private static void fillTable(JTable table, String query){
        try{
            Connection connection = createConnection();
            if(connection == null){
                System.out.println("ERROR: Connection Failed");
            } else {
                System.out.println("Successfully Connected to DB");
            }
            Statement stat = connection.createStatement();
            ResultSet rs = stat.executeQuery(query);

            //To remove previously added rows
            while(table.getRowCount() > 0) 
            {
                ((DefaultTableModel) table.getModel()).removeRow(0);
            }
            int columns = rs.getMetaData().getColumnCount();
            
            while(rs.next()){  
                Object[] row = new Object[columns];
                for (int i = 1; i <= columns; i++)
                {  
                    row[i - 1] = rs.getObject(i);
                }
                ((DefaultTableModel) table.getModel()).insertRow(rs.getRow()-1,row);
            }

        rs.close();
        stat.close();
        connection.close();
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private static Connection createConnection(){
        try {  
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://74.117.171.123:3306/CAPSTONE","uacapstone","UAcapstone4");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton button_Instructor_MarkIncorrect;
    private javax.swing.JButton button_Instructor_Save;
    private javax.swing.JButton button_Student_Dispute;
    private javax.swing.JButton button_Student_LogOut;
    private javax.swing.JButton button_Test_Refresh;
    private javax.swing.JButton button_Welcome_Login;
    private javax.swing.JComboBox<String> combo_Instructor_FilterCourse;
    private javax.swing.JComboBox<String> combo_Instructor_FilterStudent;
    private javax.swing.JComboBox<String> combo_Instructor_SelectCourse;
    private javax.swing.JComboBox<String> combo_Instructor_SelectDate;
    private javax.swing.JComboBox<String> combo_Instructor_SelectStudent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel label_Student_ClassName;
    private javax.swing.JLabel label_Student_Date;
    private javax.swing.JLabel label_Student_StudentName;
    private javax.swing.JLabel label_Student_Time;
    private javax.swing.JLabel label_Welcome_Email;
    private javax.swing.JLabel label_Welcome_Password;
    private javax.swing.JPanel panel_Admin;
    private javax.swing.JPanel panel_Instructor;
    private javax.swing.JPanel panel_Student;
    private javax.swing.JPanel panel_Test;
    private javax.swing.JScrollPane panel_Test_StudentList;
    private javax.swing.JPanel panel_Welcome;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable table_Instructor_Absence;
    private javax.swing.JTable table_Student_Absence;
    private javax.swing.JTable table_Student_Attendence;
    private javax.swing.JTable table_Test_StudentList;
    private javax.swing.JTextField textField_Welcome_Email;
    private javax.swing.JTextField textField_Welcome_Password;
    // End of variables declaration//GEN-END:variables
}
