package org.project.carrental.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class Order {
    private long id;

    private long userId;

    private long carId;

    private Date orderDate;

    private Date returnDate;

    private boolean carRetruned;

    private BigDecimal rentalCost;

    public Order() {
    }

    public Order(long id, long userId, long carId, Date orderDate, Date returnDate, boolean carRetruned, BigDecimal rentalCost) {
        this.id = id;
        this.userId = userId;
        this.carId = carId;
        this.orderDate = orderDate;
        this.returnDate = returnDate;
        this.carRetruned = carRetruned;
        this.rentalCost = rentalCost;
    }

    public Order(long userId, long carId, Date orderDate, Date returnDate, boolean carRetruned, BigDecimal rentalCost) {
        this.userId = userId;
        this.carId = carId;
        this.orderDate = orderDate;
        this.returnDate = returnDate;
        this.carRetruned = carRetruned;
        this.rentalCost = rentalCost;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getCarId() {
        return carId;
    }

    public void setCarId(long carId) {
        this.carId = carId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public boolean isCarRetruned() {
        return carRetruned;
    }

    public void setCarRetruned(boolean carRetruned) {
        this.carRetruned = carRetruned;
    }

    public BigDecimal getRentalCost() {
        return rentalCost;
    }

    public void setRentalCost(BigDecimal rentalCost) {
        this.rentalCost = rentalCost;
    }

    //toString
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", carId=" + carId +
                ", orderDate=" + orderDate +
                ", returnDate=" + returnDate +
                ", carRetruned=" + carRetruned +
                ", rentalCost=" + rentalCost +
                '}';
    }


    //Equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && userId == order.userId && carId == order.carId && carRetruned == order.carRetruned && Objects.equals(orderDate, order.orderDate) && Objects.equals(returnDate, order.returnDate) && Objects.equals(rentalCost, order.rentalCost);
    }

    //HashCode
    @Override
    public int hashCode() {
        return Objects.hash(id, userId, carId, orderDate, returnDate, carRetruned, rentalCost);
    }
}
