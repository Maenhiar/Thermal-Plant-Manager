package model.condominiummanager;

import java.util.Optional;

/**
 * This interface represents a condominium manager and provides its basic contact information.
 */
public interface CondominiumManager {

    /**
     * @return the condominium owner's name.
     */
    String getName();

    /**
     * @return the condominium owner's surname.
     */
    String getSurname();

    /**
     * @return the condominium owner's phone number.
     */
    String getPhoneNumber();

    /**
     * @return the condominium owner's email address.
     */
    Optional<String> getEmailAddress();

    /**
     * Sets the name of the condominium owner.
     *
     * @param name the name of the condominium owner.
     */
    void setName(final String name);

    /**
     * Sets the surname of the condominium owner.
     *
     * @param surname the surname of the condominium owner.
     */
    void setSurname(final String surname);

    /**
     * Sets the phone number of the condominium owner.
     *
     * @param phoneNumber the new phone number of the condominium owner.
     */
    void setPhoneNumber(final String phoneNumber);

    /**
     * Sets the email address number of the condominium owner.
     *
     * @param emailAddress the new address number of the condominium owner.
     */
    void setEmailAddress(final Optional<String> emailAddress);
}
