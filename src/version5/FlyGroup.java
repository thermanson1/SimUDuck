/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package version5;

/**
 *
 * @author Teraesa
 */
public interface FlyGroup extends Duck{
    public abstract void performFly();
    public abstract void setFlyBehavior(FlyStrategy flyBehav);
}
