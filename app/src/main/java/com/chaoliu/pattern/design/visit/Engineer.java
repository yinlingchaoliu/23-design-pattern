package com.chaoliu.pattern.design.visit;

/**
 * 受访者--工程师
 */
public class Engineer implements IAccept {

    private String name;
    private String kpi;
    private String line;
    private IVisitor visitor;

    public Engineer(String name, String kpi, String line) {
        this.name = name;
        this.kpi = kpi;
        this.line = line;
    }

    @Override
    public void accept(IVisitor visit) {
        visitor = visit;
        visit.visit( this );
    }

    @Override
    public void showInfo() {
        if (visitor.kind() == Kind.CEO){
            System.out.println( "Engineer{" +
                    "name='" + name + '\'' +
                    ", kpi='" + kpi + '\'' +
                    '}' );
        }else if(visitor.kind() == Kind.CTO){
            System.out.println( "Engineer{" +
                    "name='" + name + '\'' +
                    ", line='" + line + '\'' +
                    '}' );
        }else if(visitor.kind() == Kind.HR){
            System.out.println( "Engineer{" +
                    "name='" + name + '\'' +
                    '}' );
        }
    }

}