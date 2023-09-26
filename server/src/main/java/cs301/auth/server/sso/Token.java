package cs301.auth.server.sso;

import java.io.Serializable;

public class Token implements Serializable {
    private String access_token;
    private String token_type;
    private String id_token;
    private long created_at;
    private int expires_in;
    private String scope;
    

    public String getAccess_token() {
        return access_token;
    }


    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }


    public String getToken_type() {
        return token_type;
    }


    public void setToken_type(String token_type) {
        this.token_type = token_type;
    }


    public String getId_token() {
        return id_token;
    }


    public void setId_token(String id_token) {
        this.id_token = id_token;
    }


    public long getCreated_at() {
        return created_at;
    }


    public void setCreated_at(long created_at) {
        this.created_at = created_at;
    }


    public int getExpires_in() {
        return expires_in;
    }


    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }


    public String getScope() {
        return scope;
    }


    public void setScope(String scope) {
        this.scope = scope;
    }


    @Override
    public String toString() {
        return "Token [access_token=" + access_token + ", token_type=" + token_type + ", created_at=" + created_at
                + ", expires_in=" + expires_in + ", scope=" + scope + "]";
    }

}
