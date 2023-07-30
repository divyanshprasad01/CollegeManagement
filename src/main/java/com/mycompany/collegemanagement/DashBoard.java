
package com.mycompany.collegemanagement;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JLabel;

/**
 *
 * @author Divyansh Prasad
 */
public class DashBoard extends javax.swing.JFrame implements MouseListener{

    String USER_ID,PASSWORD,USER_TYPE;
    
    JLabel selectedItem;
    
    CardLayout rightPane;
    
    
    public DashBoard(String USER_ID, String PASSWORD, String USER_TYPE) {
        this.USER_ID = USER_ID;
        this.PASSWORD = PASSWORD;
        this.USER_TYPE = USER_TYPE;
        
        initComponents();
        
        new CollegeDatabase();
        
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>

    
    scrlHeader.setText("     "+USER_TYPE);
    
    
    rightPane = (CardLayout) RightPanelMain.getLayout();
    rightPane.show(RightPanelMain, "DashBoardPaneStr");
    

    selectedItem = item1;
    
    
    if(USER_TYPE.equals("ADMIN")){
        item1.setText("     DASHBOARD");
        item1.addMouseListener(this);
        
        item2.setText("     AUTHENTICATION DATABASE");
        item2.addMouseListener(this);
        
        item3.setText("     STUDENT DATABASE");
        item3.addMouseListener(this);
        
        item4.setText("     MARKSHEET DATABASE");
        item4.addMouseListener(this);
 
        item5.setText("     COURSES DATABASE");
        item5.addMouseListener(this);
        
        item6.setText("     FACULTY DATABASE");
        item6.addMouseListener(this);
        
        item7.setText("");
        item8.setText("");
        item9.setText("");
        item10.setText("");
        item11.setText("");
        item12.setText("");
        item13.setText("");
        item14.setText("");
        
    }else if(USER_TYPE.equals("FACULTY")){
        
        item1.setText("     DASHBOARD");
        item1.addMouseListener(this);
        
        item2.setText("     TIME TABLE");
        item2.addMouseListener(this);
        
        item3.setText("     STUDY MATERIAL UPLOAD");
        item3.addMouseListener(this);
        
        item4.setText("     CHAT WITH STUDENTS");
        item4.addMouseListener(this);
 
        item5.setText("     MAKE AN ANNOUNCEMENT");
        item5.addMouseListener(this);
        
        item6.setText("     REPORT A PROBLEM");
        item6.addMouseListener(this);
        
        item7.setText("     APPLY FOR LEAVE");
        item7.addMouseListener(this);
        
        item8.setText("     PAYMENT RELATED QUARIES");
        item8.addMouseListener(this);

        
        item9.setText("     REQUEST A RESOURCE");
        item9.addMouseListener(this);
        
        item10.setText("     MEETINGS");
        item10.addMouseListener(this);


        
        item11.setText("");
        item12.setText("");
        item13.setText("");
        item14.setText("");
        
    }else{
        
        item1.setText("     DASHBOARD");
        item1.addMouseListener(this);
        
        item2.setText("     COURSES");
        item2.addMouseListener(this);
        
        item3.setText("     PROGRESS REPORT");
        item3.addMouseListener(this);
        
        item4.setText("     FACULTIES");
        item4.addMouseListener(this);
 
        item5.setText("     TIME TABLE");
        item5.addMouseListener(this);
        
        item6.setText("     GRIEVANCE");
        item6.addMouseListener(this);
        
        item7.setText("     FINANCE PORTAL");
        item7.addMouseListener(this);
        
        item8.setText("     NOTICES");
        item8.addMouseListener(this);

        
        item9.setText("     ONGOING EVENTS");
        item9.addMouseListener(this);
        
        item10.setText("     DISCUSSION HUB");
        item10.addMouseListener(this);
        
        item11.setText("     STUDENTS HELP TEAM");
        item11.addMouseListener(this);
        
        item12.setText("     COURSE REGISTRATION");
        item12.addMouseListener(this);
        
        item13.setText("     CERTIFICATIONS");
        item13.addMouseListener(this);
        
        item14.setText("     ABOUT US");
        item14.addMouseListener(this);
    }


    
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
        jSplitPane1 = new javax.swing.JSplitPane();
        ScrSideNavPane = new javax.swing.JScrollPane();
        SideNavPane = new javax.swing.JPanel();
        scrlHeader = new javax.swing.JLabel();
        item1 = new javax.swing.JLabel();
        item2 = new javax.swing.JLabel();
        item3 = new javax.swing.JLabel();
        item4 = new javax.swing.JLabel();
        item5 = new javax.swing.JLabel();
        item6 = new javax.swing.JLabel();
        item7 = new javax.swing.JLabel();
        item8 = new javax.swing.JLabel();
        item9 = new javax.swing.JLabel();
        item10 = new javax.swing.JLabel();
        item11 = new javax.swing.JLabel();
        item12 = new javax.swing.JLabel();
        item13 = new javax.swing.JLabel();
        item14 = new javax.swing.JLabel();
        RightPanelMain = new javax.swing.JPanel();
        ScrDashBoardPane = new javax.swing.JScrollPane();
        DashBoardPane = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ScrCoursesPane = new javax.swing.JScrollPane();
        CoursesPane = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ScrProgRepPane = new javax.swing.JScrollPane();
        CoursesPane1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ScrFacultiesPane = new javax.swing.JScrollPane();
        CoursesPane2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        ScrTimeTablePane = new javax.swing.JScrollPane();
        CoursesPane3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        ScrGrievancePane = new javax.swing.JScrollPane();
        CoursesPane4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        ScrFinancePortalPane = new javax.swing.JScrollPane();
        CoursesPane5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ScrNoticesPane = new javax.swing.JScrollPane();
        CoursesPane6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        ScrOngoingEventsPane = new javax.swing.JScrollPane();
        CoursesPane7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        ScrDiscussionHubPane = new javax.swing.JScrollPane();
        CoursesPane8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        ScrStudentHelpTeamPane = new javax.swing.JScrollPane();
        CoursesPane9 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ScrCourseSemRegPane = new javax.swing.JScrollPane();
        CoursesPane10 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        ScrCertificatesPane = new javax.swing.JScrollPane();
        CoursesPane11 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ScrAboutUsPane = new javax.swing.JScrollPane();
        CoursesPane12 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1050, 715));

        jPanel1.setBackground(new java.awt.Color(0, 28, 48));

        jSplitPane1.setDividerSize(0);

        ScrSideNavPane.setBackground(new java.awt.Color(0, 28, 48));
        ScrSideNavPane.setBorder(null);
        ScrSideNavPane.setForeground(new java.awt.Color(255, 255, 255));
        ScrSideNavPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        ScrSideNavPane.setToolTipText("");
        ScrSideNavPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        ScrSideNavPane.setPreferredSize(new java.awt.Dimension(287, 780));

        SideNavPane.setBackground(new java.awt.Color(0, 28, 48));
        SideNavPane.setPreferredSize(new java.awt.Dimension(287, 780));

        scrlHeader.setFont(new java.awt.Font("Dubai Light", 0, 12)); // NOI18N
        scrlHeader.setForeground(new java.awt.Color(255, 255, 255));
        scrlHeader.setText("     ADMIN");
        scrlHeader.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(218, 255, 251)));
        scrlHeader.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        item1.setBackground(new java.awt.Color(112, 255, 134));
        item1.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item1.setForeground(new java.awt.Color(255, 255, 255));
        item1.setText("     DASHBOARD");
        item1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item1.setOpaque(true);

        item2.setBackground(new java.awt.Color(0, 28, 48));
        item2.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item2.setForeground(new java.awt.Color(255, 255, 255));
        item2.setText("     COURSES");
        item2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item2.setOpaque(true);

        item3.setBackground(new java.awt.Color(0, 28, 48));
        item3.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item3.setForeground(new java.awt.Color(255, 255, 255));
        item3.setText("     PROGRESS REPORT");
        item3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item3.setOpaque(true);

        item4.setBackground(new java.awt.Color(0, 28, 48));
        item4.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item4.setForeground(new java.awt.Color(255, 255, 255));
        item4.setText("     FACULTIES");
        item4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item4.setOpaque(true);

        item5.setBackground(new java.awt.Color(0, 28, 48));
        item5.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item5.setForeground(new java.awt.Color(255, 255, 255));
        item5.setText("     TIME TABLE");
        item5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item5.setOpaque(true);

        item6.setBackground(new java.awt.Color(0, 28, 48));
        item6.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item6.setForeground(new java.awt.Color(255, 255, 255));
        item6.setText("     GRIEVANCE");
        item6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item6.setOpaque(true);

        item7.setBackground(new java.awt.Color(0, 28, 48));
        item7.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item7.setForeground(new java.awt.Color(255, 255, 255));
        item7.setText("     FINANCE PORTAL");
        item7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item7.setOpaque(true);

        item8.setBackground(new java.awt.Color(0, 28, 48));
        item8.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item8.setForeground(new java.awt.Color(255, 255, 255));
        item8.setText("     NOTICES");
        item8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item8.setOpaque(true);

        item9.setBackground(new java.awt.Color(0, 28, 48));
        item9.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item9.setForeground(new java.awt.Color(255, 255, 255));
        item9.setText("     ONGOING EVENTS");
        item9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item9.setOpaque(true);

        item10.setBackground(new java.awt.Color(0, 28, 48));
        item10.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item10.setForeground(new java.awt.Color(255, 255, 255));
        item10.setText("     DISCUSSION HUB");
        item10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item10.setOpaque(true);

        item11.setBackground(new java.awt.Color(0, 28, 48));
        item11.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item11.setForeground(new java.awt.Color(255, 255, 255));
        item11.setText("     STUDENT HELP TEAM");
        item11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item11.setOpaque(true);

        item12.setBackground(new java.awt.Color(0, 28, 48));
        item12.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item12.setForeground(new java.awt.Color(255, 255, 255));
        item12.setText("     COURSE & SEMESTER REGISTRATION");
        item12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item12.setOpaque(true);

        item13.setBackground(new java.awt.Color(0, 28, 48));
        item13.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item13.setForeground(new java.awt.Color(255, 255, 255));
        item13.setText("     CERTIFICATES");
        item13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item13.setOpaque(true);

        item14.setBackground(new java.awt.Color(0, 28, 48));
        item14.setFont(new java.awt.Font("Dubai", 0, 12)); // NOI18N
        item14.setForeground(new java.awt.Color(255, 255, 255));
        item14.setText("     ABOUT OUR UNIVERSITY");
        item14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        item14.setOpaque(true);

        javax.swing.GroupLayout SideNavPaneLayout = new javax.swing.GroupLayout(SideNavPane);
        SideNavPane.setLayout(SideNavPaneLayout);
        SideNavPaneLayout.setHorizontalGroup(
            SideNavPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(item2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item13, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
            .addComponent(item14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)
        );
        SideNavPaneLayout.setVerticalGroup(
            SideNavPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideNavPaneLayout.createSequentialGroup()
                .addComponent(scrlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item7, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item11, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item13, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(item14, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ScrSideNavPane.setViewportView(SideNavPane);

        jSplitPane1.setLeftComponent(ScrSideNavPane);

        RightPanelMain.setBackground(new java.awt.Color(255, 255, 255));
        RightPanelMain.setLayout(new java.awt.CardLayout());

        ScrDashBoardPane.setBorder(null);

        DashBoardPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout DashBoardPaneLayout = new javax.swing.GroupLayout(DashBoardPane);
        DashBoardPane.setLayout(DashBoardPaneLayout);
        DashBoardPaneLayout.setHorizontalGroup(
            DashBoardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(DashBoardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DashBoardPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        DashBoardPaneLayout.setVerticalGroup(
            DashBoardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(DashBoardPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(DashBoardPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrDashBoardPane.setViewportView(DashBoardPane);

        RightPanelMain.add(ScrDashBoardPane, "DashBoardStr");

        ScrCoursesPane.setBorder(null);

        CoursesPane.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Courses");

        javax.swing.GroupLayout CoursesPaneLayout = new javax.swing.GroupLayout(CoursesPane);
        CoursesPane.setLayout(CoursesPaneLayout);
        CoursesPaneLayout.setHorizontalGroup(
            CoursesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPaneLayout.setVerticalGroup(
            CoursesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPaneLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrCoursesPane.setViewportView(CoursesPane);

        RightPanelMain.add(ScrCoursesPane, "CoursesStr");

        ScrProgRepPane.setBorder(null);

        CoursesPane1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("PROGRESS REP");

        javax.swing.GroupLayout CoursesPane1Layout = new javax.swing.GroupLayout(CoursesPane1);
        CoursesPane1.setLayout(CoursesPane1Layout);
        CoursesPane1Layout.setHorizontalGroup(
            CoursesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane1Layout.setVerticalGroup(
            CoursesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrProgRepPane.setViewportView(CoursesPane1);

        RightPanelMain.add(ScrProgRepPane, "ProgRepStr");

        ScrFacultiesPane.setBorder(null);

        CoursesPane2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("FACULTIES");

        javax.swing.GroupLayout CoursesPane2Layout = new javax.swing.GroupLayout(CoursesPane2);
        CoursesPane2.setLayout(CoursesPane2Layout);
        CoursesPane2Layout.setHorizontalGroup(
            CoursesPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane2Layout.setVerticalGroup(
            CoursesPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrFacultiesPane.setViewportView(CoursesPane2);

        RightPanelMain.add(ScrFacultiesPane, "FacultiesStr");

        ScrTimeTablePane.setBorder(null);

        CoursesPane3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setText("TIME TABLE");

        javax.swing.GroupLayout CoursesPane3Layout = new javax.swing.GroupLayout(CoursesPane3);
        CoursesPane3.setLayout(CoursesPane3Layout);
        CoursesPane3Layout.setHorizontalGroup(
            CoursesPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane3Layout.setVerticalGroup(
            CoursesPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrTimeTablePane.setViewportView(CoursesPane3);

        RightPanelMain.add(ScrTimeTablePane, "TimeTableStr");

        ScrGrievancePane.setBorder(null);

        CoursesPane4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setText("GRIEVANCE");

        javax.swing.GroupLayout CoursesPane4Layout = new javax.swing.GroupLayout(CoursesPane4);
        CoursesPane4.setLayout(CoursesPane4Layout);
        CoursesPane4Layout.setHorizontalGroup(
            CoursesPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane4Layout.setVerticalGroup(
            CoursesPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane4Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrGrievancePane.setViewportView(CoursesPane4);

        RightPanelMain.add(ScrGrievancePane, "GrievanceStr");

        ScrFinancePortalPane.setBorder(null);

        CoursesPane5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setText("FINANCE PORTAL");

        javax.swing.GroupLayout CoursesPane5Layout = new javax.swing.GroupLayout(CoursesPane5);
        CoursesPane5.setLayout(CoursesPane5Layout);
        CoursesPane5Layout.setHorizontalGroup(
            CoursesPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane5Layout.setVerticalGroup(
            CoursesPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane5Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrFinancePortalPane.setViewportView(CoursesPane5);

        RightPanelMain.add(ScrFinancePortalPane, "FinancePortalStr");

        ScrNoticesPane.setBorder(null);

        CoursesPane6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setText("NOTICES");

        javax.swing.GroupLayout CoursesPane6Layout = new javax.swing.GroupLayout(CoursesPane6);
        CoursesPane6.setLayout(CoursesPane6Layout);
        CoursesPane6Layout.setHorizontalGroup(
            CoursesPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane6Layout.setVerticalGroup(
            CoursesPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane6Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel8)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrNoticesPane.setViewportView(CoursesPane6);

        RightPanelMain.add(ScrNoticesPane, "NoticesStr");

        ScrOngoingEventsPane.setBorder(null);

        CoursesPane7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setText("ONGOING EVENTS");

        javax.swing.GroupLayout CoursesPane7Layout = new javax.swing.GroupLayout(CoursesPane7);
        CoursesPane7.setLayout(CoursesPane7Layout);
        CoursesPane7Layout.setHorizontalGroup(
            CoursesPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane7Layout.setVerticalGroup(
            CoursesPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane7Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel9)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrOngoingEventsPane.setViewportView(CoursesPane7);

        RightPanelMain.add(ScrOngoingEventsPane, "OngoingEventsStr");
        ScrOngoingEventsPane.getAccessibleContext().setAccessibleName("");

        ScrDiscussionHubPane.setBackground(new java.awt.Color(2, 245, 233));
        ScrDiscussionHubPane.setBorder(null);

        CoursesPane8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("DISCUSSION HUB");

        javax.swing.GroupLayout CoursesPane8Layout = new javax.swing.GroupLayout(CoursesPane8);
        CoursesPane8.setLayout(CoursesPane8Layout);
        CoursesPane8Layout.setHorizontalGroup(
            CoursesPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane8Layout.setVerticalGroup(
            CoursesPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane8Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel10)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrDiscussionHubPane.setViewportView(CoursesPane8);

        RightPanelMain.add(ScrDiscussionHubPane, "DiscussionHubStr");

        ScrStudentHelpTeamPane.setBackground(new java.awt.Color(230, 6, 78));
        ScrStudentHelpTeamPane.setBorder(null);

        CoursesPane9.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setText("STUDENT HELP");

        javax.swing.GroupLayout CoursesPane9Layout = new javax.swing.GroupLayout(CoursesPane9);
        CoursesPane9.setLayout(CoursesPane9Layout);
        CoursesPane9Layout.setHorizontalGroup(
            CoursesPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane9Layout.setVerticalGroup(
            CoursesPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane9Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrStudentHelpTeamPane.setViewportView(CoursesPane9);

        RightPanelMain.add(ScrStudentHelpTeamPane, "StudentHelpTeamStr");

        ScrCourseSemRegPane.setBackground(new java.awt.Color(55, 55, 55));
        ScrCourseSemRegPane.setBorder(null);

        CoursesPane10.setBackground(new java.awt.Color(255, 255, 255));

        jLabel12.setText("COURSES SEM REG");

        javax.swing.GroupLayout CoursesPane10Layout = new javax.swing.GroupLayout(CoursesPane10);
        CoursesPane10.setLayout(CoursesPane10Layout);
        CoursesPane10Layout.setHorizontalGroup(
            CoursesPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane10Layout.setVerticalGroup(
            CoursesPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane10Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel12)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrCourseSemRegPane.setViewportView(CoursesPane10);

        RightPanelMain.add(ScrCourseSemRegPane, "CourseSemRegStr");

        ScrCertificatesPane.setBackground(new java.awt.Color(22, 66, 168));
        ScrCertificatesPane.setBorder(null);

        CoursesPane11.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setText("CERTIFICATES");

        javax.swing.GroupLayout CoursesPane11Layout = new javax.swing.GroupLayout(CoursesPane11);
        CoursesPane11.setLayout(CoursesPane11Layout);
        CoursesPane11Layout.setHorizontalGroup(
            CoursesPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane11Layout.setVerticalGroup(
            CoursesPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane11Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel13)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrCertificatesPane.setViewportView(CoursesPane11);

        RightPanelMain.add(ScrCertificatesPane, "CertificatesStr");

        ScrAboutUsPane.setBackground(new java.awt.Color(162, 166, 68));
        ScrAboutUsPane.setBorder(null);

        CoursesPane12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setText("ABOUT US");

        javax.swing.GroupLayout CoursesPane12Layout = new javax.swing.GroupLayout(CoursesPane12);
        CoursesPane12.setLayout(CoursesPane12Layout);
        CoursesPane12Layout.setHorizontalGroup(
            CoursesPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 665, Short.MAX_VALUE)
            .addGroup(CoursesPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        CoursesPane12Layout.setVerticalGroup(
            CoursesPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(CoursesPane12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(CoursesPane12Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel14)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ScrAboutUsPane.setViewportView(CoursesPane12);

        RightPanelMain.add(ScrAboutUsPane, "AboutUsStr");

        jSplitPane1.setRightComponent(RightPanelMain);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CoursesPane;
    private javax.swing.JPanel CoursesPane1;
    private javax.swing.JPanel CoursesPane10;
    private javax.swing.JPanel CoursesPane11;
    private javax.swing.JPanel CoursesPane12;
    private javax.swing.JPanel CoursesPane2;
    private javax.swing.JPanel CoursesPane3;
    private javax.swing.JPanel CoursesPane4;
    private javax.swing.JPanel CoursesPane5;
    private javax.swing.JPanel CoursesPane6;
    private javax.swing.JPanel CoursesPane7;
    private javax.swing.JPanel CoursesPane8;
    private javax.swing.JPanel CoursesPane9;
    private javax.swing.JPanel DashBoardPane;
    private javax.swing.JPanel RightPanelMain;
    private javax.swing.JScrollPane ScrAboutUsPane;
    private javax.swing.JScrollPane ScrCertificatesPane;
    private javax.swing.JScrollPane ScrCourseSemRegPane;
    private javax.swing.JScrollPane ScrCoursesPane;
    private javax.swing.JScrollPane ScrDashBoardPane;
    private javax.swing.JScrollPane ScrDiscussionHubPane;
    private javax.swing.JScrollPane ScrFacultiesPane;
    private javax.swing.JScrollPane ScrFinancePortalPane;
    private javax.swing.JScrollPane ScrGrievancePane;
    private javax.swing.JScrollPane ScrNoticesPane;
    private javax.swing.JScrollPane ScrOngoingEventsPane;
    private javax.swing.JScrollPane ScrProgRepPane;
    private javax.swing.JScrollPane ScrSideNavPane;
    private javax.swing.JScrollPane ScrStudentHelpTeamPane;
    private javax.swing.JScrollPane ScrTimeTablePane;
    private javax.swing.JPanel SideNavPane;
    private javax.swing.JLabel item1;
    private javax.swing.JLabel item10;
    private javax.swing.JLabel item11;
    private javax.swing.JLabel item12;
    private javax.swing.JLabel item13;
    private javax.swing.JLabel item14;
    private javax.swing.JLabel item2;
    private javax.swing.JLabel item3;
    private javax.swing.JLabel item4;
    private javax.swing.JLabel item5;
    private javax.swing.JLabel item6;
    private javax.swing.JLabel item7;
    private javax.swing.JLabel item8;
    private javax.swing.JLabel item9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel scrlHeader;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        
        selectedItem.setBackground(new Color(0x001C30));
        selectedItem = (JLabel) e.getSource();
        
        
         if(e.getSource() == item1){
            item1.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "DashBoardStr");
        }else if(e.getSource() == item2){
            item2.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "CoursesStr");
        }else if(e.getSource() == item3){
            item3.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "ProgRepStr");
        }else if(e.getSource() == item4){
            item4.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "FacultiesStr");
        }else if(e.getSource() == item5){
            item5.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "TimeTableStr");
        }else if(e.getSource() == item6){
            item6.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "GrievanceStr");
        }else if(e.getSource() == item7){
            item7.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "FinancePortalStr");
        }else if(e.getSource() == item8){
            item8.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "NoticesStr");
        }else if(e.getSource() == item9){
            item9.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "OngoingEventsStr");
        }else if(e.getSource() == item10){
            item10.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "DiscussionHubStr");
        }else if(e.getSource() == item11){
           item11.setBackground(new Color(0x70FF86));
           rightPane.show(RightPanelMain, "StudentHelpTeamStr");
        }else if(e.getSource() == item12){
            item12.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "CourseSemRegStr");
        }else if(e.getSource() == item14){
            item14.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "AboutUsStr");
        }else if(e.getSource() == item13){
            item13.setBackground(new Color(0x70FF86));
            rightPane.show(RightPanelMain, "CertificatesStr");
        } 
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(e.getSource() == item1){
            item1.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item2){
            item2.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item3){
            item3.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item4){
            item4.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item5){
            item5.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item6){
            item6.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item7){
            item7.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item8){
            item8.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item9){
            item9.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item10){
            item10.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item11){
           item11.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item12){
            item12.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item14){
            item14.setBackground(new Color(0x70FF86));
        }else if(e.getSource() == item13){
            item13.setBackground(new Color(0x70FF86));
        } 
    
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(e.getSource() == item1 && e.getSource() != selectedItem){
            item1.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item2 && e.getSource() != selectedItem){
            item2.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item3 && e.getSource() != selectedItem){
            item3.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item4 && e.getSource() != selectedItem){
            item4.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item5 && e.getSource() != selectedItem){
            item5.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item6 && e.getSource() != selectedItem){
            item6.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item7 && e.getSource() != selectedItem){
            item7.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item8 && e.getSource() != selectedItem){
            item8.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item9 && e.getSource() != selectedItem){
            item9.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item10 && e.getSource() != selectedItem){
            item10.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item11 && e.getSource() != selectedItem){
           item11.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item12 && e.getSource() != selectedItem){
            item12.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item14 && e.getSource() != selectedItem){
            item14.setBackground(new Color(0x001C30));
        }else if(e.getSource() == item13 && e.getSource() != selectedItem){
            item13.setBackground(new Color(0x001C30));
        } 
    }
}
