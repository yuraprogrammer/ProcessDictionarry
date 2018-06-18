package com.alexprom.entities.process;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-06-18T14:49:26")
@StaticMetamodel(VotgUppgDetail.class)
public class VotgUppgDetail_ { 

    public static volatile SingularAttribute<VotgUppgDetail, Integer> tankOrder;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> startTemp;
    public static volatile SingularAttribute<VotgUppgDetail, Long> startMass;
    public static volatile SingularAttribute<VotgUppgDetail, Long> startVolume;
    public static volatile SingularAttribute<VotgUppgDetail, BigInteger> otgToUppgMass;
    public static volatile SingularAttribute<VotgUppgDetail, Long> actID;
    public static volatile SingularAttribute<VotgUppgDetail, Long> startLevel;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> startDensity;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> endDensity;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> endDensity20;
    public static volatile SingularAttribute<VotgUppgDetail, Long> finishLevel;
    public static volatile SingularAttribute<VotgUppgDetail, Long> endVolume;
    public static volatile SingularAttribute<VotgUppgDetail, String> tankName;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> startDensity20;
    public static volatile SingularAttribute<VotgUppgDetail, Long> id;
    public static volatile SingularAttribute<VotgUppgDetail, BigDecimal> endTemp;
    public static volatile SingularAttribute<VotgUppgDetail, BigInteger> otgToUppgVolume;
    public static volatile SingularAttribute<VotgUppgDetail, Long> endMass;

}