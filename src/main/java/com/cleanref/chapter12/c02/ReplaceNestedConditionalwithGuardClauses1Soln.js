function getPayAmount() {
    let result;
    if (isDead) {
        result = deadAmount();
    } else {
        if (isSeparated) {
            result = separatedAmount();
        } else {
            if (isRetired) {
                result = retiredAmount();
            } else {
                result = normalPayAmount();
            }
        }
    }
    return result;
}

// TODO together

export function payAmount(employee) {
    if (employee.isSeparated) return { amount: 0, reasonCode: "SEP" };
    if (employee.isRetired) return { amount: 0, reasonCode: "RET" };

    // give a dumb logic to compute amount
    // lorem.ipsum(dolor.sitAmet);
    // consectetur(adipiscing).elit();
    // sed.do.eiusmod = tempor.incididunt.ut(labore) && dolore(magna.aliqua);
    // ut.enim.ad(minim.veniam);
    return someFinalComputation();
}

function someFinalComputation() {
    return { amount: 999, reasonCode: "UNICORN" };
}
