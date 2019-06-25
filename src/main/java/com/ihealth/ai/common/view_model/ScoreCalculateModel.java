package com.ihealth.ai.common.view_model;

import java.util.List;

public class ScoreCalculateModel {
    
    List<Product> products;
    
    public List<Product> getProducts() {
        return products;
    }
    
    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
    public class Product {
        private String id;
        private Double orderCount;
        private Double trackCount;
        Boolean highlight;
    
        public String getId() {
            return id;
        }
    
        public void setId(String id) {
            this.id = id;
        }
    
        public Double getOrderCount() {
            return orderCount;
        }
    
        public void setOrderCount(Double orderCount) {
            this.orderCount = orderCount;
        }
    
        public Double getTrackCount() {
            return trackCount;
        }
    
        public void setTrackCount(Double trackCount) {
            this.trackCount = trackCount;
        }
    
        public Boolean getHighlight() {
            return highlight;
        }
    
        public void setHighlight(Boolean highlight) {
            this.highlight = highlight;
        }
    
        @Override
        public String toString() {
            return "Product{" +
                "id='" + id + '\'' +
                ", orderCount=" + orderCount +
                ", trackCount=" + trackCount +
                '}';
        }
    }
}
