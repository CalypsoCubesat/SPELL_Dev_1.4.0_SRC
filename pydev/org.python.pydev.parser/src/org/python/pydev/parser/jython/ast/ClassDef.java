// Autogenerated AST node
package org.python.pydev.parser.jython.ast;

import org.python.pydev.parser.jython.SimpleNode;
import java.util.Arrays;

public final class ClassDef extends stmtType {
    public NameTokType name;
    public exprType[] bases;
    public stmtType[] body;
    public decoratorsType[] decs;
    public keywordType[] keywords;
    public exprType starargs;
    public exprType kwargs;

    public ClassDef(NameTokType name, exprType[] bases, stmtType[] body, decoratorsType[] decs,
    keywordType[] keywords, exprType starargs, exprType kwargs) {
        this.name = name;
        this.bases = bases;
        this.body = body;
        this.decs = decs;
        this.keywords = keywords;
        this.starargs = starargs;
        this.kwargs = kwargs;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + Arrays.hashCode(bases);
        result = prime * result + Arrays.hashCode(body);
        result = prime * result + Arrays.hashCode(decs);
        result = prime * result + Arrays.hashCode(keywords);
        result = prime * result + ((starargs == null) ? 0 : starargs.hashCode());
        result = prime * result + ((kwargs == null) ? 0 : kwargs.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        ClassDef other = (ClassDef) obj;
        if (name == null) { if (other.name != null) return false;}
        else if (!name.equals(other.name)) return false;
        if (!Arrays.equals(bases, other.bases)) return false;
        if (!Arrays.equals(body, other.body)) return false;
        if (!Arrays.equals(decs, other.decs)) return false;
        if (!Arrays.equals(keywords, other.keywords)) return false;
        if (starargs == null) { if (other.starargs != null) return false;}
        else if (!starargs.equals(other.starargs)) return false;
        if (kwargs == null) { if (other.kwargs != null) return false;}
        else if (!kwargs.equals(other.kwargs)) return false;
        return true;
    }
    @Override
    public ClassDef createCopy() {
        return createCopy(true);
    }
    @Override
    public ClassDef createCopy(boolean copyComments) {
        exprType[] new0;
        if(this.bases != null){
        new0 = new exprType[this.bases.length];
        for(int i=0;i<this.bases.length;i++){
            new0[i] = (exprType) (this.bases[i] != null?
            this.bases[i].createCopy(copyComments):null);
        }
        }else{
            new0 = this.bases;
        }
        stmtType[] new1;
        if(this.body != null){
        new1 = new stmtType[this.body.length];
        for(int i=0;i<this.body.length;i++){
            new1[i] = (stmtType) (this.body[i] != null? this.body[i].createCopy(copyComments):null);
        }
        }else{
            new1 = this.body;
        }
        decoratorsType[] new2;
        if(this.decs != null){
        new2 = new decoratorsType[this.decs.length];
        for(int i=0;i<this.decs.length;i++){
            new2[i] = (decoratorsType) (this.decs[i] != null?
            this.decs[i].createCopy(copyComments):null);
        }
        }else{
            new2 = this.decs;
        }
        keywordType[] new3;
        if(this.keywords != null){
        new3 = new keywordType[this.keywords.length];
        for(int i=0;i<this.keywords.length;i++){
            new3[i] = (keywordType) (this.keywords[i] != null?
            this.keywords[i].createCopy(copyComments):null);
        }
        }else{
            new3 = this.keywords;
        }
        ClassDef temp = new ClassDef(name!=null?(NameTokType)name.createCopy(copyComments):null,
        new0, new1, new2, new3, starargs!=null?(exprType)starargs.createCopy(copyComments):null,
        kwargs!=null?(exprType)kwargs.createCopy(copyComments):null);
        temp.beginLine = this.beginLine;
        temp.beginColumn = this.beginColumn;
        if(this.specialsBefore != null && copyComments){
            for(Object o:this.specialsBefore){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsBefore().add(commentType.createCopy(copyComments));
                }
            }
        }
        if(this.specialsAfter != null && copyComments){
            for(Object o:this.specialsAfter){
                if(o instanceof commentType){
                    commentType commentType = (commentType) o;
                    temp.getSpecialsAfter().add(commentType.createCopy(copyComments));
                }
            }
        }
        return temp;
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer("ClassDef[");
        sb.append("name=");
        sb.append(dumpThis(this.name));
        sb.append(", ");
        sb.append("bases=");
        sb.append(dumpThis(this.bases));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append(", ");
        sb.append("decs=");
        sb.append(dumpThis(this.decs));
        sb.append(", ");
        sb.append("keywords=");
        sb.append(dumpThis(this.keywords));
        sb.append(", ");
        sb.append("starargs=");
        sb.append(dumpThis(this.starargs));
        sb.append(", ");
        sb.append("kwargs=");
        sb.append(dumpThis(this.kwargs));
        sb.append("]");
        return sb.toString();
    }

    @Override
    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitClassDef(this);
    }

    @Override
    public void traverse(VisitorIF visitor) throws Exception {
        if (name != null) {
            name.accept(visitor);
        }
        if (bases != null) {
            for (int i = 0; i < bases.length; i++) {
                if (bases[i] != null) {
                    bases[i].accept(visitor);
                }
            }
        }
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null) {
                    body[i].accept(visitor);
                }
            }
        }
        if (decs != null) {
            for (int i = 0; i < decs.length; i++) {
                if (decs[i] != null) {
                    decs[i].accept(visitor);
                }
            }
        }
        if (keywords != null) {
            for (int i = 0; i < keywords.length; i++) {
                if (keywords[i] != null) {
                    keywords[i].accept(visitor);
                }
            }
        }
        if (starargs != null) {
            starargs.accept(visitor);
        }
        if (kwargs != null) {
            kwargs.accept(visitor);
        }
    }

}
