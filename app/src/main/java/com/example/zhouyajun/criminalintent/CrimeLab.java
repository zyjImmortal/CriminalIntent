package com.example.zhouyajun.criminalintent;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class CrimeLab {
    private static CrimeLab sCrimeLab;
    private List<Crime> sCrimes;

    public static CrimeLab get(Context context) {
        if (sCrimeLab == null) {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public CrimeLab(Context context) {
        sCrimes = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Crime crime = new Crime();
            crime.setmTitle("Crime #" + i);
            crime.setmSolved(i % 2 == 0);
            sCrimes.add(crime);
        }
    }

    public List<Crime> getCrimes() {
        return sCrimes;
    }

    public Crime getCrime(UUID uuid) {
        for (Crime crime : sCrimes) {
            if (crime.getUuid() == uuid) {
                return crime;
            }
        }
        return null;
    }
}
