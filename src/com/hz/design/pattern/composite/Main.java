package com.hz.design.pattern.composite;

/**
 * @program: design-pattern-learning
 * @author: zgr
 * @create: 2021-10-21 11:04
 **/
public class Main {
    public static void main(String[] args) {
        //海南分院
        ConcreteCompany haiNanBranch = new ConcreteCompany("海南分院");
        haiNanBranch.add(new HumanResourceDepartment("海南分院人事处"));
        haiNanBranch.add(new FinanceDepartment("海南分院财务处"));

        //云南分院
        ConcreteCompany yunNanBranch = new ConcreteCompany("云南分院");
        yunNanBranch.add(new HumanResourceDepartment("云南分院人事处"));
        yunNanBranch.add(new FinanceDepartment("云南分院财务处"));

        //总院
        ConcreteCompany institute = new ConcreteCompany("天津总院");
        institute.add(new HumanResourceDepartment("总院人力资源部"));
        institute.add(new FinanceDepartment("总院资产财务部"));
        institute.add(haiNanBranch);
        institute.add(yunNanBranch);

        System.out.println("结构图：");
        institute.disPlay(0);
        System.out.println("\n职责：");
        institute.displayDuty();
    }
}
