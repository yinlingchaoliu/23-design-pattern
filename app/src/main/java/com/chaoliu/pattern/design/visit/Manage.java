package com.chaoliu.pattern.design.visit;

/**
 * 受访者--经理
 *
 */
public class Manage implements IAccept{

    private String name;
    private String kpi;
    private String product;
    private IVisitor visitor;

    public Manage(String name, String kpi, String product) {
        this.name = name;
        this.kpi = kpi;
        this.product = product;
    }

    @Override
    public void accept(IVisitor visit) {
        visitor = visit;
        visit.visit( this );
    }

    @Override
    public void showInfo() {
        if (visitor.kind() == Kind.CEO){
            System.out.println( "Manage{" +
                    "name='" + name + '\'' +
                    ", kpi='" + kpi + '\'' +
                    ", product='" + product + '\'' +
                    '}' );
        }else if(visitor.kind() == Kind.CTO){
            System.out.println( "Manage{" +
                    "name='" + name + '\'' +
                    ", product='" + product + '\'' +
                    '}' );
        }else if(visitor.kind() == Kind.HR){
            System.out.println( "Manage{" +
                    "name='" + name + '\'' +
                    '}' );
        }

    }

}
