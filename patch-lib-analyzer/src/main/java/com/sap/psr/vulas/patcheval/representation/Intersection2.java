/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sap.psr.vulas.patcheval.representation;

/**
 * Represents the intersection between distances to vulnerable and to fixed (for a certain construct) among different libraries.
 */
public class Intersection2 {
    ArtifactResult2 from, to;
    int occurrences;
    Double confidence;
    
    /**
     * <p>Constructor for Intersection2.</p>
     *
     * @param from a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     * @param to a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     * @param o a int.
     * @param d a {@link java.lang.Double} object.
     */
    public Intersection2(ArtifactResult2 from, ArtifactResult2 to, int o, Double d) {
        this.from = from;
        this.to = to;
        this.occurrences = o;
        this.confidence = d;
        
    }

    /**
     * <p>Getter for the field <code>from</code>.</p>
     *
     * @return a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     */
    public ArtifactResult2 getFrom() {
        return from;
    }

    /**
     * <p>Setter for the field <code>from</code>.</p>
     *
     * @param from a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     */
    public void setFrom(ArtifactResult2 from) {
        this.from = from;
    }

    /**
     * <p>Getter for the field <code>to</code>.</p>
     *
     * @return a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     */
    public ArtifactResult2 getTo() {
        return to;
    }

    /**
     * <p>Setter for the field <code>to</code>.</p>
     *
     * @param to a {@link com.sap.psr.vulas.patcheval.representation.ArtifactResult2} object.
     */
    public void setTo(ArtifactResult2 to) {
        this.to = to;
    }

    /**
     * <p>Getter for the field <code>confidence</code>.</p>
     *
     * @return a {@link java.lang.Double} object.
     */
    public Double getConfidence() {
        return confidence;
    }

    /**
     * <p>Setter for the field <code>confidence</code>.</p>
     *
     * @param confidence a {@link java.lang.Double} object.
     */
    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    


    
}
