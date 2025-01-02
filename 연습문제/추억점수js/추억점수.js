function solution(name, yearning, photo) {
    // Step 1: 이름과 점수 매핑
    const point = {};
    for (let i = 0; i < name.length; i++) {
        point[name[i]] = yearning[i];
    }

    // Step 2: 사진별 점수 계산
    const answer = photo.map(group => {
        return group.reduce((score, person) => {
            // 점수 합산, 없는 경우 기본값 0
            return score + (point[person] || 0);
        }, 0);
    });

    return answer;
}
