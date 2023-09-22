package condominiummanager;

import condominiummanager.CondominiumManager;

import java.util.Optional;

/**
 * This class implements the information about a condominium manager.
 */
public final class CondominiumManagerImpl implements CondominiumManager {
    private String name;
    private String surname;
    private String phoneNumber;
    private Optional<String> emailAddress;

    public CondominiumManagerImpl(final String name, final String surname, final String phoneNumber,
                                  final Optional<String> emailAddress) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSurname() {
        return this.surname;
    }

    @Override
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Override
    public Optional<String> getEmailAddress() {
        return this.emailAddress;
    }

    @Override
    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public void setSurname(final String surname) {
        this.surname = surname;
    }

    @Override
    public void setPhoneNumber(final String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void setEmailAddress(final Optional<String> emailAddress) {
        this.emailAddress = emailAddress;
    }


}
