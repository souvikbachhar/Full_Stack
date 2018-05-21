package com.souvik;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QEmployee is a Querydsl query type for Employee
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QEmployee extends EntityPathBase<Employee> {

    private static final long serialVersionUID = -1695126128L;

    public static final QEmployee employee = new QEmployee("employee");

    public final DateTimePath<java.util.Date> empdoj = createDateTime("empdoj", java.util.Date.class);

    public final NumberPath<Long> empid = createNumber("empid", Long.class);

    public final StringPath employeetype = createString("employeetype");

    public final StringPath empname = createString("empname");

    public final NumberPath<Float> emptotalsalary = createNumber("emptotalsalary", Float.class);

    public QEmployee(String variable) {
        super(Employee.class, forVariable(variable));
    }

    public QEmployee(Path<? extends Employee> path) {
        super(path.getType(), path.getMetadata());
    }

    public QEmployee(PathMetadata metadata) {
        super(Employee.class, metadata);
    }

}

